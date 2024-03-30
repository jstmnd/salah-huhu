Feature: Messaging
  As a user
  I want to communicate with my connections through messages
  So that I can discuss professional opportunities and collaborations

  Scenario: As a user I can send a message
    Given I have logged in to my LinkedIn account
    When I navigate to my connections or receive a message
    And I click on the message icon
    And I write a message
    And I click on the "Send" button
    Then the message should be sent to the recipient

  Scenario: As a user I cannot send empty message
    Given I have logged in to my LinkedIn account
    When I navigate to my connections or receive a message
    And I click on the message icon
    And I tried to send a empty message
    Then I cannot click the "Send" button

  Scenario: As a user I can receive a message
    Given I have logged in to my LinkedIn account
    When I receive a message from a connection
    And I should see the message in my inbox
    Then I be able to read and respond to it

  Scenario: As a user I can delete a message
    Given I have logged in to my LinkedIn account
    When I view a message in my inbox
    And I click on the "Delete" button
    Then the message should be removed from my inbox

  Scenario: As a user I can archive a message
    Given I have logged in to my LinkedIn account
    When I view a message in my inbox
    And I click on the "Archive" button
    Then the message should be moved to the archived folder