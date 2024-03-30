Feature: Profile Management
  As a user
  I want to manage my profile information
  So that I can present myself professionally to my network and potential connections

  Scenario: As a user I can update my profile information
    Given I am on the home page
    When I navigate to the "Me" tab and select "View profile"
    And I click on the "Edit" button
    And I update my profile information
    And I click on the "Save" button
    Then my profile should be updated with the new information

  Scenario: As a user I cannot delete mandatory profile information:
    Given I am on the home page
    When I navigate to the "Me" tab and select "View profile"
    And I click on the "Edit" button
    And I attempt to delete mandatory profile information such as first name or last name
    Then I should receive an error message indicating that the field is required and cannot be left blank