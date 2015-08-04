package com.bing.search.test;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(monochrome = true,
				format={"pretty","html:reports/test-report"},
				tags= "@smokeTest",
				glue = {"com.bing.search.test"}
				)

public class RunCukesTest {

}
