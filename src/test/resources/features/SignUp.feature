Feature: Sign up feature

  Scenario: Verify user is able to sign up
    Given verify user is on login page
    When user clicks on Sign Up Here link
    Then verify user on signup first page
    When user fills out all required fields
    And user click on Next button
    Then verify user on signup second page
    When user fills out all required fields on second page
    And user click on Register button
    Then verify user can see Registration Successful message
    When user enter valid password
    And user clicks on Sign In button
    Then verify user on Home Page
