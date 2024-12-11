
Feature: Facebook Login Feature with Valid Credentials

Scenario: Login to Facebook

Given I am on Facebook Login page
When I provide userid and password
And I click on Login button
Then My Login should be successful
And I should get navigated to Homepage

