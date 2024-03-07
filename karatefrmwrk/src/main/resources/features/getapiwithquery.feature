Feature: Get API with query parameter

Scenario: get all active users 
* def query = {status:'active',gender:'female',id:6140445}
Given url 'https://gorest.co.in/public/v2/users'
And params query
When method GET
Then status 200
* print response

Scenario: get all active users 
* def query = {status:'active'}
Given url 'https://gorest.co.in/public/v2/users'
And params query
When method GET
Then status 200
* def jsonResponse = response
* print jsonResponse
* def actCount = jsonResponse.length
* print actCount
* match actCount == 10


