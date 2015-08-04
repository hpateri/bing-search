package com.bing.search;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class BingSearch {
	
	private WebDriver driver;
	
	public BingSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	public void user_is_on_bing_home_page() {
		driver.get("http://www.bing.com");
	}
	
	public void user_enters_search_text(String text) {
		driver.findElement(By.cssSelector(".b_searchbox")).clear();
		driver.findElement(By.cssSelector(".b_searchbox")).sendKeys(text);
	}
	
	public void user_clicks_search_icon() {
		driver.findElement(By.cssSelector(".b_searchboxSubmit")).submit();
	}
	
	public void get_page_title() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

}
