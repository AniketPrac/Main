Feature: Application Login
Scenario Outline: Admin Page default login

Given User is on NetBanking page
When User login  with <UserName> and password "<Password>" application
Then Home page is displayed
And Cards are displayed

Examples: 

	| UserName | Password |
	| CreditUser| Admin123 |
	| DebitUser | Admin345 |
	
	
 Scenario: user on Page default login

Given User is on NetBanking page
When User login  with <UserName> and password "<Password>" application
Then Home page is displayed
And Cards are displayed
	
