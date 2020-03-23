#Author: heriberto-hg@hotmail.com
#Keywords Summary :Register a user

@RegisterAUser
Feature: Register a user
  I want to register a user with their complete information

  @tag1
  Scenario: Register a user
    Given I'm on the registration screen
    When Enter the user's personal information
    Then Successful registration and automatic login
