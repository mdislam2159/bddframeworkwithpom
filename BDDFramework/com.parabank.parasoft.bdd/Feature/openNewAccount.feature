Feature: parabank Open New Account functionality 

Scenario: Valid user should be able Open New Account 

	Given user already in Account Overview page 
	When user click on Open New Account 
	Then user click on type of Account drop down and select account type 
	Then click on OPEN NEW ACCOUNT button 
	And user click on logout page