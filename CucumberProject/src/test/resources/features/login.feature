Feature: Login Feature

  Scenario: Login to Facebook website
    Given I am on Login page
    And I have valid userid and password
    When I provide valid user and password
    And I click on Submit button
    Then website will take me to Homepage of Facebookpage
    And I can see facebook feeds
