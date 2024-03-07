Feature: Get API Feature

Scenario: get user details

Given url 'https://gorest.co.in/public/v2/users'
And path  '6140487'
When method GET
Then status 200
* print response
* def jsonResponse = response
* print jsonResponse
* def actName = jsonResponse.name
* print actName
* match actName == 'Bhushit Namboothiri'


Scenario: get user details - not found

Given url 'https://gorest.co.in/public/v2/users'
And path  '30'
When method GET
Then status 404