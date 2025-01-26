Feature: Login Feature

  Scenario: Testing With Valid Username
    Given The Page is Loaded
    When I Enter The "Username" and "Password"
    And Click On Login button
    Then Redirected To The Home Page
