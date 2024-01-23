Feature: Login Functionality
@positiveLogin
  Scenario: Positive Login Test
    Given User is on the home page
    When Tap on signIn button
    When Login to the zeroBank
    Then Validate that user is logged in