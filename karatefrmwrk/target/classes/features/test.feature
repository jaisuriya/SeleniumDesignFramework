Feature: to delete the user from API

background:
* url 'https://gorest.co.in/'

scenario: delete the active user
* def tokenId = '80f991a8917298ac01597ca48f80f45724a2cb1a78f0bd83a3111d5508d0940b'
Given path 'public/v2/users/6521728'
And header Authorization = 'Bearer ' + tokenId
When method DELETE
Then status 204

scenario: check the user details deleted

Given path 'public/v2/users/6521728'
When method GET
Then status 404

