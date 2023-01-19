Feature: login functionality

  Scenario: valid creds
    Given user in on login page
    When user enters username "Admin"
    And user enters password "admin123"
    Then user able to see homepage



