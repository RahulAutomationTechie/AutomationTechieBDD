Feature: Test Guru99 application
Scenario: To test Login functionality

Given User is on login page
When User enters valid username
And User enters valid password
And User clicks on signIn button
Then User is able to login

