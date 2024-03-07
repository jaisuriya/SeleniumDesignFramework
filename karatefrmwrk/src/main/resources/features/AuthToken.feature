Feature: GET API feature

Scenario: Get user details
* def TokenId = '80f991a8917298ac01597ca48f80f45724a2cb1a78f0bd83a3111d5508d0940b'
* print TokenId
Given header Authorization = 'Bearer ' + TokenId
Given url 'https://gorest.co.in/public/v2/users'
And path 6203435
When method GET
Then status 200