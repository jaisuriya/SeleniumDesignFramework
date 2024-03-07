Feature: To delete the user from api 

Background:
 * url 'https://gorest.co.in'
 
Scenario: Delete a user with the given userID

* def token = '80f991a8917298ac01597ca48f80f45724a2cb1a78f0bd83a3111d5508d0940b'
Given path '/public/v2/users/6140220'
And header Authorization = 'Bearer ' + token
When method DELETE
Then status 204

Scenario: get the user data found or not
Given url 'https://gorest.co.in/public/v2/users/6140220'
When method GET
Then status 404

