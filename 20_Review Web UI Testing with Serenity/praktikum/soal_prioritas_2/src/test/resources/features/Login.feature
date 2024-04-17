@Login
Feature: Login
  As a user
  I want to login
  So that I can access my account information and make purchases

  Background:
    Given I am on the login page

  @Valid-credentials
  Scenario: As a user I can login with valid credentials
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    Then I am on the dashboard page

  @Invalid-credentials
  Scenario: As a user I cannot login with invalid credentials
    When I input invalid email
    And I input invalid password
    And I click on the "Masuk" button
    Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."

  @Empty-fields
  Scenario: As a user I cannot login with empty fields
    When I leave the phone number or email and password fields empty
    Then I cannot click "Masuk" button