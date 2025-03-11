Feature: Login to facebook account
  In order to login to facebook website
  As a user I need to be on Pagebook home website

  Scenario: Login to Facebook with credentials
    Given I am on facebook Login Screen
    And I can validate that Login Screen
    When I provide "<username>" User id
    And I provide "<password>" password
    And I click on Login butoon
    Then I am navigated to Facebook HomeScreen
    And I can see Homescreen Feeds

    Examples:
    |username|password|
    |valid|valid|
    |valid|valid|
    |valid|invalid|
    |invalid|valid|