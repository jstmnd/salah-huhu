Feature: Payment Process
  As a user
  I want to choose a payment method and complete the payment process
  So that I can finalize my purchases

  Scenario: As a user I can select payment method
    Given I am on the checkout page
    When I see the payment details
    And I see the available payment methods
    And I select a payment method
    Then I click "Bayar Sekarang" button

  Scenario: As a user I can use a promotional code
    Given I am on the checkout page
    When I see the payment details
    And I entered the promo code in the promo code section
    And I see the available payment methods
    And I select a payment method
    Then I click "Bayar Sekarang" button

  Scenario: As a user I can receive payment confirmation
    Given I have completed the payment process
    When I receive a payment confirmation
    Then I should see a confirmation message

  Scenario: As a user I cannot pay if the payment time has expired
    Given I am on the checkout page
    When I see the payment details
    And I entered the promo code in the promo code section
    And I see the available payment methods
    And I select a payment method
    And I click "Bayar Sekarang" button
    And I waited until the payment time was up without making a transaction
    Then an error message will be displayed that the payment time has expired and directed back to the Sepulsa application