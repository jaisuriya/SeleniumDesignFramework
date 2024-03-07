Feature: update the user details using PUT api

Background:
* url 'https://gorest.co.in'
* def requestPayload =
 """
 {
   "email": "karatekannanapitesting@gmail.com",
   "status":"active"
 }
 """
 
Scenario: update the user with the given data

* def token = '80f991a8917298ac01597ca48f80f45724a2cb1a78f0bd83a3111d5508d0940b'
Given path '/public/v2/users/6204507'
And request requestPayload
And header Authorization = 'Bearer ' + token
When method PUT
Then status 200
And match $.email == 'karatekannanapitesting@gmail.com'
And match $.status == 'active'