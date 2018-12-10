Meta:

Narrative:
As a user
I want to perform calculation
So that I can get the result of two numbers operations

Scenario: scenario addition
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <firstNumber>
And I give the second number as <secondNumber>
Then I should get the result as <result>

Examples:
|sign|firstNumber|secondNumber|result|
|+|10|2|12|

Scenario: scenario subtraction
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <firstNumber>
And I give the second number as <secondNumber>
Then I should get the result as <result>

Examples:
|sign|firstNumber|secondNumber|result|
|-|10|2|8|

Scenario: scenario multiplication
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <firstNumber>
And I give the second number as <secondNumber>
Then I should get the result as <result>

Examples:
|sign|firstNumber|secondNumber|result|
|*|10|2|20|

Scenario: scenario division
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <firstNumber>
And I give the second number as <secondNumber>
Then I should get the result as <result>

Examples:
|sign|firstNumber|secondNumber|result|
|/|10|2|5|
