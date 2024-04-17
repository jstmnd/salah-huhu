@Checkout
Feature: Checkout
  As a user
  I can checkout items in cart
  So that I can buy it

  Background:
    Given I am on the login page

  @Can-checkout
  Scenario: As a user I can checkout item from cart
    When I input valid username
    And I input valid password
    And I click login button
    And I add item to the cart
    And I go to the cart page
    And I click checkout button
    And I input first name
    And I input last name
    And I input postal code
    And I click continue button
    Then I click finish button

  @Can-checkout-without-select-item
  Scenario: As a user I can checkout zero from cart
    When I input valid username
    And I input valid password
    And I click login button
    And I go to the cart page
    And I click checkout button
    And I input first name
    And I input last name
    And I input postal code
    And I click continue button
    Then I click finish button

  @Cannot-checkout
  Scenario: As a user I cannot checkout item from cart
    When I input error username
    And I input valid password
    And I click login button
    And I add item to the cart
    And I go to the cart page
    And I click checkout button
    And I click continue button
    Then I can see error message "Error: First Name is required"