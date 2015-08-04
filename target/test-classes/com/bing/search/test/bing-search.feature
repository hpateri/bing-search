@smokeTest
Feature: Search on Bing
Scenario: Basic Search on Bing page
	Given user is on bing home page
	When user enter search "selenium" text
	And user clicks search icon
	Then search results page is displayed