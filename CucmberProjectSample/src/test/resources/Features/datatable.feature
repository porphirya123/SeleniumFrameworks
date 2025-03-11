@datatable
Feature: Login to Facebook Production Environment
  In order to navigate Customer login page
  As a user
  	I want to click on Customer link

  Scenario: Login to Facebook as User in Production
    Given User is on WayToAutomatin Homepage
    When I click on Customer Login link
    Then I provide "valid" user id
    And I provide "password" password
    And capture captcha image
    And user enters userid and password
    	|FirstName| LastName|
      | Santosh | Kumar   |
      | Ankita  | Agarwal |
    And I click on Login button
