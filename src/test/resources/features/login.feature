Feature: Login Functionality


  Background:
    Given User is on the home page
    When Tap on signIn button

  @positiveLogin
  Scenario: Positive Login Test
    When Login to the zeroBank
    Then Validate that user is logged in

  @negativeLogin
  Scenario Outline:
    When Enter "<username>" and "<password>"
    And Tap on login button
    Then Validate error message is displayed
    Examples:
      | username | password |
      | username | test     |
      | test     | password |
      |          | password |
      | username |          |
      |          |          |