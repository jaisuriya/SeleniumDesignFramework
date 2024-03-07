Feature: Test login functionality
@smoke
Scenario Outline: Check login is successful with valid credentials

Given browser is open
And user is on login page
When user enters<username>and<password>
And user clicks on login
Then user is navigated to the homepage

Examples:|
   |username|password|
   |Jayasuriya S|rahulshettyacademy|
   
 