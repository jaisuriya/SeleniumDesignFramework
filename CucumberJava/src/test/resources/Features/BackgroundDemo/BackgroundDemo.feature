Feature: Check homepage functionality

Background: user is logged in
Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to homepage



Scenario: check logout link
 When user click on profile link
 Then logout link is displayed
 
 Scenario: verify quick launch toolbar is present
 When user click on directory link
 Then quick launch toolbar is displayed