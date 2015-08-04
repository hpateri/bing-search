$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\bing\\search\\test\\bing-search.feature");
formatter.feature({
  "id": "search-on-bing",
  "tags": [
    {
      "name": "@smokeTest",
      "line": 1
    }
  ],
  "description": "",
  "name": "Search on Bing",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "search-on-bing;basic-search-on-bing-page",
  "description": "",
  "name": "Basic Search on Bing page",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "user is on bing home page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "user enter search \"selenium\" text",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "user clicks search icon",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "search results page is displayed",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "stepDefinition.user_is_on_bing_home_page()"
});
formatter.result({
  "duration": 379495115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 19
    }
  ],
  "location": "stepDefinition.user_enters_search_text(String)"
});
formatter.result({
  "duration": 887055302,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_clicks_search_icon()"
});
formatter.result({
  "duration": 78132835,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.get_page_title()"
});
formatter.result({
  "duration": 1284380966,
  "status": "passed"
});
});