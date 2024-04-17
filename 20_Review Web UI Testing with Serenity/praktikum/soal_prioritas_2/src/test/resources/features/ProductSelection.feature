@Product-selection
Feature: Product Selection
  As a user
  I want to select products available
  So that I can choose the services I want to purchase

  Background:
    Given I am on the login page

  @Can-select
  Scenario: As a user I can select product
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    And I navigate to the products section
    And I select a product
    And I input my number
    And I select available option
    Then I am on the checkout page

  @Cannot-select
  Scenario: As a user I cannot select unavailable product
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    And I navigate to the products section
    And I select a product
    And I input my number
    Then I can't select unavailable option