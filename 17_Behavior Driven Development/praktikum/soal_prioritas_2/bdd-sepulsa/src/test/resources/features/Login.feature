Feature: Login
  As a user
  I want to log in to my Sepulsa account
  So that I can access my account information and make purchases

  Scenario: As a user I can login with valid credentials
    Given I am on the login page
    When I enter valid phone number or email and password
    And I click on the "Masuk" button
    Then I should be redirected to the dashboard

  Scenario: As a user I cannot login with invalid credentials
    Given I am on the login page
    When I enter invalid phone number or email and password
    And I click on the "Masuk" button
    Then I should see an error message indicating invalid credentials

  Scenario: As a user I cannot login with empty fields
    Given I am on the login page
    When I leave the phone number or email and password fields empty
    Then I cannot click "Masuk" button