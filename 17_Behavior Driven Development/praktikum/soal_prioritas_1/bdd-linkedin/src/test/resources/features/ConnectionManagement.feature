Feature: Connection Management
  As a user
  I want to find and connect with other professionals
  So that I can can expand my professional network

  Scenario: As a user I can search for connections
    Given I am on the homepage
    When I enter a name in the search bar
    And I click on the search button
    Then I should see a list of connections matching the name

  Scenario: As a user I can send connection request
    Given I am on the homepage
    When I search for a user
    And I click on the "Connect" button next to their profile
    Then a connection request should be sent

  Scenario: As a user I can accept connection request
    Given I have pending connection requests
    When I navigate to the "My Network" tab
    And I click on the "Manage all" button under "Invitations"
    And I accept a pending request
    Then the connection should be added to my network

  Scenario: As a user I cannot send excessive connection requests
    Given I am a LinkedIn user with a public profile
    When I send an overwhelming number of connection requests over a few days
    Then my account should be temporarily restricted