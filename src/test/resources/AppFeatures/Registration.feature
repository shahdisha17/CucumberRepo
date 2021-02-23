Feature: User registration

Scenario: User registration with different dataset
Given User is on registration page
Then User enters following details for registration
	| Disha | Shah | test@test.com | 37373675 | Chicago | ADP |
	| Kiaan | Shah | work@test.com | 64467745 | London | XYZ |
	| Smita | Patil | test@work.com | 65756756 | UK | ABC |
	
Then User should be successfully register

	
	
