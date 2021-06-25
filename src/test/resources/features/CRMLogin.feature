Feature: CRM Login feature

Scenario: Valid Login Scenario
Given User is already on Login page
When User enters login credential
	|uname|pwd|
	|ajaypanand007@gmail.com|Ajay@1997|
Then User is on homepage
Then Close browser