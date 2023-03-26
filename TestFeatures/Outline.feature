Feature: To test ORG HRM

Scenario Outline: To test login page
Given User is on the login page
When User enters "<username>" and "<password>"
Then User is logged In successfully

Examples:
|username|password|
|Admin	 |admin123|
|hrm     |hrm@987 |
|org     |org%123 |
|654653  |jgfg^&%(|

