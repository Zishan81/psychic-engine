
Feature: Test Account Features
  

 @Task
  Scenario: Verify type fields are present 
  Given I am on the login page
  And I enter valid username as "test.user@gmail.com.test"
  And I enter valid password as "Pa55word"
  When I click the login button
  Then I should see the dashboardtion
  And I click Accounts field 
  And I click new button 
  And I should see all the type options

