Feature: Login,Registration and Search For Product

Background:
	Given The user is on Home Page
	
Scenario: Verify Login is functional
And Enters the "test@test.com" and "password"
And Click on Login button 

Scenario: Verify the user is able to Search For product
When The user is on search page
Then Gives the search keyword "Shirts"
And Clicks on Search icon