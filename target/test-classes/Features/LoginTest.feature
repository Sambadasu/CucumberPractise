Feature: Login to the application
	
	@SmokeTest
  Scenario Outline: Verify login is successful with valid credentials
    Given user is on testlogin page
    When user enters <username> and <password>
    And clicks on login or testsubmit button
    Then user nagigates to testhomepage
    
    Examples:
    |username|password|
    |Samba|12345|
    |Ram|12345|
