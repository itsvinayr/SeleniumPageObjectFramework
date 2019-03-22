Feature: Login
I want to use this feature to test login functionality

Scenario: Test login for valid username and password
Given user navigates to costco
When user clicks on sign in link
Then user enters username
And user enters password
And user clicks on submit button
Then user should login successfully