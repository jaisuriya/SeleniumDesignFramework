Feature: To test Print statement in karate framework

Scenario: Test karate framework
   
    * print 'Hello jayasuriya'
	* print 'Welcome to API Testing'
	
Scenario: declare and print variables
	* def Balance = 200
	* def sgst    = 9
	* def cgst    = 9
	
	* print 'total amount -> ' + (Balance + sgst +cgst)
	