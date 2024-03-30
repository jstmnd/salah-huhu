Feature: Content Interaction
  As a user
  I want to interact with posts and updates in my feed
  So that I can engage with my network and share relevant information

  Scenario: As a user I can post a status update
    Given I am logged into my LinkedIn account
    When I navigate to the homepage
    And I click on the "Start a post" section
    And I write a status update
    And I click on the "Post" button
    Then my status update should be visible on my feed

  Scenario:  I cannot post a status update with empty inputs
    Given I am logged into my LinkedIn account
    When I navigate to the homepage
    And I click on the "Start a post" section
    And I didn't fill anything in there
    Then I cannot click the "post" button

  Scenario: As a user I can like a post
    Given there are posts on my LinkedIn feed
    When I see a post
    And I click on the "Like" button
    Then the post should show that I liked it

  Scenario: As a user I can comment a post
    Given there are posts on my LinkedIn feed
    When I see a post
    And I click on the "Comment" button
    And I write a comment
    And I click on the "Post" button
    Then my comment should appear under the post

  Scenario: As a user I can repost a post
    Given there are posts on my LinkedIn feed
    When I see a post
    And I click on the "Repost" button
    And I add any additional comments if needed
    And I click on the "Repost" button again
    Then the post should be shared on my profile as a repost

  Scenario: As a user I can share a post
    Given there are posts on my LinkedIn feed
    When I see a post
    And I click on the "Send" button
    And I choose the sharing options
    And I click on the "Post" button
    Then the post should be shared to selected connections