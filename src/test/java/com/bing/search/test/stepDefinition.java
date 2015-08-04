package com.bing.search.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

import com.bing.search.BingSearch; 

public class stepDefinition {
	
	WebDriver driver;
	
	@Before
	public void set_up() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	@After
	public void tear_down() {
		driver.quit();
	}
	
	@Given("^user is on bing home page$")
	public void user_is_on_bing_home_page() {
		new BingSearch(driver).user_is_on_bing_home_page();
	}
	
	@When("^user enter search \"([^\"]*)\" text$")
	public void user_enters_search_text(String text) {
		new BingSearch(driver).user_enters_search_text(text);
	}
	
	@When("^user clicks search icon$")
	public void user_clicks_search_icon() {
		new BingSearch(driver).user_clicks_search_icon();
	}
	
	@Then("^search results page is displayed$")
	public void get_page_title() {
		new BingSearch(driver).get_page_title();
	}

}
