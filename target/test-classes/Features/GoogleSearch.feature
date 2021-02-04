Feature: Test Google Search Functionality

  @SmokeTest
  Scenario: Check Google Search is working
    Given browser is open
    And user is on google search page
    When user enters text in search box
    And Clicks on search button
    Then verify results
