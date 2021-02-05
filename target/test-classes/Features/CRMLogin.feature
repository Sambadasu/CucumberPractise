
Feature: Login to CRM Page
 @CRMTest
  Scenario Outline: Verify login functionality for CRM
    Given User is in login page
    When User enters <username> and <password> for CRM    
    Then Validate page title
    
    Examples: 
    |username|password|
    |sambadasu@gmail.com|shiva@Dasu2|
   
