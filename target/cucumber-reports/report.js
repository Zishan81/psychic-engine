$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/account.feature");
formatter.feature({
  "line": 2,
  "name": "Test Account Features",
  "description": "",
  "id": "test-account-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify type fields are present",
  "description": "",
  "id": "test-account-features;verify-type-fields-are-present",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Task"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid username as \"test.user@gmail.com.test\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter valid password as \"Pa55word\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the dashboardtion",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click Accounts field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click new button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see all the type options",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 4500563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test.user@gmail.com.test",
      "offset": 27
    }
  ],
  "location": "LoginTest.i_enter_valid_username_as(String)"
});
formatter.result({
  "duration": 174122700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pa55word",
      "offset": 27
    }
  ],
  "location": "LoginTest.i_enter_valid_password_as(String)"
});
formatter.result({
  "duration": 170972000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_the_login_button()"
});
formatter.result({
  "duration": 222902400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_should_see_the_dashboardtion()"
});
formatter.result({
  "duration": 1741245400,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.i_click_Accounts_field()"
});
formatter.result({
  "duration": 514942800,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.i_click_new_button()"
});
formatter.result({
  "duration": 375587400,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.i_should_see_all_the_type_options()"
});
formatter.result({
  "duration": 84228300,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[--Prospect--]\u003e but was:\u003c[Prospect]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat StepDefinition.AccountTest.i_should_see_all_the_type_options(AccountTest.java:38)\r\n\tat ✽.And I should see all the type options(Feature/account.feature:14)\r\n",
  "status": "failed"
});
});