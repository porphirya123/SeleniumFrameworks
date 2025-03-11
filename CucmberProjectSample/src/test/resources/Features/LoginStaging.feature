

@Staging
Feature: Login to Facebook in Staging enviornment
  In order to navigate Customer login page
  As a user
  	I want to click on Customer link

  Background: 
    Given User is on WayToAutomatin Homepage
    When I click on Customer Login link

  Scenario: Login to Facebook as Invalid User
    Then I provide "invalid" user id
    And I provide "invalid" password
    And I click on Login button
    

  Scenario: Login to Facebook as Valid User
    Then I provide "valid" user id
    And I provide "valid" password
    And I click on Login button
    