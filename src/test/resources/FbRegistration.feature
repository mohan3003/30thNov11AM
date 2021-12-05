@Feature02
Feature: To validate the account create functionality

Background:

Given User should launch the browser and load url

	@Sanity
  Scenario: To give all necessary details to create the account
    
    When User should click the create new account button to create a account
    And User should give First name and lastname
    And User should give Either mobile number or Email id 
    And User should give proper password
   	And User should click the signup button
	  Then If all the given details are satisfied the requirements means account will create
  
 
  Scenario: To check whether invalid username and password are working correctly
    	
    When User should give the correct username 
    	
    And User should give the correct password
    	
    Then User should click the login button after entering the username and password
  	And User should click the login button
  @Regression	
	Scenario: To check whether Terms and conditons are working are not
	When User should click the Terms and condition 