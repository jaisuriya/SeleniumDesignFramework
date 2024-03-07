Feature: Create a user using post API 

Background:
 * url 'https://gorest.co.in'
 * def requestPayload =
 """
 {
   "name": "Kanna",
   "email": "Kanna23@api.com",
   "gender":"male",
   "status":"active"
 
 
 }
 """
 
Scenario: Create a user with the given data

* def token = '80f991a8917298ac01597ca48f80f45724a2cb1a78f0bd83a3111d5508d0940b'
Given path '/public/v2/users'
And request requestPayload
And header Authorization = 'Bearer ' + token
When method POST
Then status 201
And match $.name == 'Kanna'

