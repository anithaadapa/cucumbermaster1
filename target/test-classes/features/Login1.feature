Feature: Login To Test Application

Background: User launches the app
Given User lauches the application

#This is postivie login testcase
Scenario: Check if the user is able to login with valid credentials
When User enters the <username> and <password>
Then Clicks on login button
And Check if the user has logged in successfully 

Examples:
|username	|password  |
|tomsmith	|SuperSecretPassword! |

#This is Negative login testcase
Scenario: Check if the user is not able to login with invalid credentials
When User enters the "Test" and "Test"
Then Clicks on login button
And Check for Error message