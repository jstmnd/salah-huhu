Feature: Product Selection
  As a user
  I want to select products available on Sepulsa
  So that I can choose the services I want to purchase

  Scenario: As a user I can select product
    Given I am logged into my Sepulsa account
    When I navigate to the products section
    And I browse the available products
    And I select a product
    Then I should see the product details

  Scenario: As a user I cannot select unavailable product
    Given I am logged into my Sepulsa account
    When I navigate to the products section
    And I browse the available products
    And I select a product
    And I see that one or more of the options for that product is not available
    Then I can't select that option