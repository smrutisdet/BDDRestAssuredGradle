Feature: In this feature we are going to test the in valid login flow

  @Sanity
  Scenario: InValid Login Flow
    Given invalid-user logs in
    And user should still see the login page

  @Sanity
  Scenario: Valid Login Flow
    Given valid-user logs in
    And user should see the Home page