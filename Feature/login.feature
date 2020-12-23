Feature: Test login functionality
 I want to make sure the login functionality is working
 @smokeTest
 Scenario: Verify login functionality using valid credentials
  Given I am on the login page
  And I enter valid username as "test.user@gmail.com.test"
  And I enter valid password as "Pa55word"
  When I click the login button
  Then I should see the dashboardtion