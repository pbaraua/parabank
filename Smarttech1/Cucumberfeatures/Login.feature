Feature: User able to login with valid username and password
Scenario: User lonin with valid username and verify the page

Given User can open any browser
And User able to enter the URL

When User able to click login button
And User able to enter username
And User able to enter password
And User able to click on submit button

Then User able to verify sucessful login
And User can see his name in the homepage
