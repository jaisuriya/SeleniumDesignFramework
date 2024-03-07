Feature: Get API headers feature

Scenario: pass the user request with headers
Given header User-Agent = 'PostmanRuntime/7.36.1'
And header Accept-Encoding = 'gzip, deflate, br'
Given url 'https://gorest.co.in/public/v2/users'
And path '6203435'
When method GET
Then status 200

Scenario: pass the user request with headers part 2
* def request_headers = {User-Agent: 'PostmanRuntime/7.36.1',Accept-Encoding: 'gzip, deflate, br'}
Given headers request_headers
Given url 'https://gorest.co.in/public/v2/users'
And path '6203435'
When method GET
Then status 200

Scenario: pass the user request with headers part 3
* configure headers = {User-Agent: 'PostmanRuntime/7.36.1',Accept-Encoding: 'gzip, deflate, br'}
Given url 'https://gorest.co.in/public/v2/users'
And path '6203435'
When method GET
Then status 200