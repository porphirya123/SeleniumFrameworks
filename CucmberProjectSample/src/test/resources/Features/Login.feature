
@Regression
Feature: Login to Facebook QA enviornment
  In order to navigate Customer login page
  As a user
  	I want to click on Customer link

  Scenario Outline: Login to Facebook as User
    Given User is on WayToAutomatin Homepage
    When I click on Customer Login link
    Then I provide "<username>" user id
    And I provide "<password>" password
    And I click on Login button

    Examples: 
      | username | password |
      | valid    | valid    |
      | invalid  | invalid  |
      | valid    | invalid  |
      | invalid  | valid    |
