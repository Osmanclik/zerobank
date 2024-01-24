Feature: Account summary Tests

  Background:
    Given User is on the home page
    When Tap on signIn button
    When Login to the zeroBank

  @accountSummary
  Scenario:Account summary Test
    When Go to "Online Banking" menu
    And Go to "Account Summary" submenu
    Then Validate following titles
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then Validate Credit Account columns
      | Account     |
      | Credit Card |
      | Balance     |
