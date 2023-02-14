Feature: Login feature

  @Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user enter valid "valid.username" and "valid.password"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account

  @Smoke
  Scenario: Verify user is not able to login with invalid credentials
    Given user enter invalid "invalid.username" and "invalid.password"
    When user clicks on Sign In button
    Then verify user is not able to sign in

  @Smoke
  Scenario: Verify Remember Me button functionality
    Given user enter valid "valid.username" and "valid.password"
    When user clicks on Remember Me button
    And user clicks on Sign In button
    Then verify user is successfully logged in to the account
    When user clicks on Go back button
    And verify user is on login page
    Then verify username field is populated with username
