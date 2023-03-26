Feature: Test guru99

  Background: 
    Given user is on login

  @smoke
  Scenario: test login
    When user enters valid creds
    Then user is able to login

  @sanity
  Scenario: test payment gateway
    When user clicks on payment link
    Then user lands on payment page

  @sanity @smoke @regression
  Scenario: test registration
    When user clicks on payment link
    Then user lands on payment page

  @regression
  Scenario: test personal info
    When user clicks on payment link
    Then user lands on payment page

    

