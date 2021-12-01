Feature: To check the login functionality
  Scenario: To check whether valid username and password are working correctly
    Given User should be in the login page
    	
    When User should give the correct username 
    	|gowtham323@gmail.com|
    	|mohanlfj@gmail.com|
    	|noname@gamil.com|
    And User should give the correct password
    	|selenium|
    	|5790471|
    	|tesrtrr|
    Then User should click the login button after entering the username and password
  	And User should click the login button
 # Scenario Outline: To check invalid username and password 
 #   Given User should be in the login page
 #  When User should give the incorrect "<name>" username 
 #   And User should give the incorrect"<pass>" password
 #   Then User should click the login button after entering the username and password
  
 # Examples: 
 # |name|pass|
#	|mohanlfj@gmail.com|5790471|
#	|noname@gamil.com|tesrtrr|
#	|name123@gmail.com|Datastr|
#	|Check23@gmail.com|succeed|
#	|True@gmail.com|val34|