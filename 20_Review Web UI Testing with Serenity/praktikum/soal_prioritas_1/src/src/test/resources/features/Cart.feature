@Cart
Feature: Cart
  As a user
  I can manage items in cart
  So that I can proceed to checkout

  Background:
    Given I am on the login page

  @Can-add
  Scenario: As a user I can add item to the cart
    When I input valid username
    And I input valid password
    And I click login button
    And I add item to the cart
    Then the item is added to the cart

  @Cannot-add
  Scenario: As a user I cannot add item to the cart
    When I input error username
    And I input valid password
    And I click login button
    Then I cannot add item to the cart

  @Problem-user
  Scenario: As a problem user I cannot remove products from cart
    When I input problem username
    And I input valid password
    And I click login button
    And I am on the products page
    And I add item to the cart
    Then I cannot remove it