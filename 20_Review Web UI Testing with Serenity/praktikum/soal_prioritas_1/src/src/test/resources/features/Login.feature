@Login
Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the login page

  @Normal-user
  Scenario: As a user I can login with valid credentials
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the products page

  @Glitch-user
  Scenario: As a user I can login with glitch user account
    When I input glitch username
    And I input valid password
    And I click login button
    Then I am on the products page

  @Locked-user
  Scenario: As a locked user I cannot access product page
    When I input locked username
    And I input valid password
    And I click login button
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."

