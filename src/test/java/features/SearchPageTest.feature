Feature: Search Page Test cases

Background:
	Given The application is launched and in search page


@regression @smoke
Scenario: Verify if the Search URL and the title is correct
And Verify the page url
And Verify the page title

@regression @smoke
Scenario: Verify if the user is able to search for a product
And Enter the search "Shirts"
And Clicks on search button

@regression
Scenario: Verify if the user is able to add item to cart
And Enter the search "Shirts"
And Clicks on search button
And Click on the product
And Add item to cart

@smoke
Scenario: Verify if the search icon is visibile on the page
And Verify the search icon

@regression
Scenario: Verify if the user is able to filter based on Delivery Day
When The user clicks on Get it by Tomrrow
And The products should be displayed to the user