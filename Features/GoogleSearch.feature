Feature: perform a google search

Scenario Outline: simple keyword search

Given I am on google hoempage
When I enter a search "<keyword>"
And I click on search button 
Then I see the number of results returned

Examples:
|keyword 						|		
|Quality Assurance	|
|Software Testing 	|


