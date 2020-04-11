Feature: parabank login functionality 

Scenario: Valid user should be able to login successfully

	Given user already in login page 
	When user enter valid credentials 
	Then user click on login button 
	And user click on logout button 

	
