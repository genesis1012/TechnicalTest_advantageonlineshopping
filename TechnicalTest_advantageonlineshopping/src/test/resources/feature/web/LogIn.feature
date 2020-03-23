#Author: heriberto-hg@hotmail.com
#Keywords Summary : LogIn


@LogIn
Feature: LogIn Users
  I want to log in with recently registered users

  Background: The user starts out on the login page
  			Given Register a user

    Scenario: The user enters a valid username and password, they must log in without a problem
    		Given Close session
         When Enter the registered user and password
         Then Successful login