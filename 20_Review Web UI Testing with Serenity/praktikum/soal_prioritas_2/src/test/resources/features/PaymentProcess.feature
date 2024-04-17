@Payment-process
Feature: Payment Process
  As a user
  I want to choose a payment method and complete the payment process
  So that I can finalize my purchases

  Background:
    Given I am on the login page

  @Select-method
  Scenario: As a user I can select payment method
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    And I navigate to the products section
    And I select a product
    And I input my number
    And I select available option
    And I navigate to the checkout page
    And I see the payment details
    And I see the available payment methods
    And I select a payment method
    Then I click "Bayar Sekarang" button

  @Promo-code
  Scenario: As a user I can use a promotional code
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    And I navigate to the products section
    And I select a product
    And I input my number
    And I select available option
    And I navigate to the checkout page
    And I see the payment details
    And I entered the promo code in the promo code section
    And I see the available payment methods
    And I select a payment method
    Then I click "Bayar Sekarang" button

  @Cannot-pay
  Scenario: As a user I cannot pay if I do not select a payment type
    When I input valid email
    And I input valid password
    And I click on the "Masuk" button
    And I navigate to the products section
    And I select a product
    And I input my number
    And I select available option
    And I navigate to the checkout page
    And I see the payment details
    And I see the available payment methods
    And I click "Bayar Sekarang" button
    Then I can see notification message "Kamu belum memilih metode pembayaran"