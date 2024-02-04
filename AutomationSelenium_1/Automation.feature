Feature: Login Functionality (User able to log in with valid username and Password) What to test?

  Scenario: User able to login with a valid username and verify the page title.
    Given User's able to open any browser
    And User able to enter the URL
    When User able to click on Signin Button
    When User able to enter Username
    And User able to enter Password
    And User able to click on the Login Button
    Then User able to login successfully.