Feature: json feature testing

Scenario: json reader

* def jsonObject = 
"""
[
{
   "Software":"Karate framework",
   "version": 1.4.1
},
{
    "Software":"Karate core",
   "version": 1.3.1
}
]
"""
* print jsonObject
* print jsonObject[0].Software
* print jsonObject[1].Software+" "+jsonObject[1].version