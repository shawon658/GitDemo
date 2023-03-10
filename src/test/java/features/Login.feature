Feature: Application Login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started


@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into Application with "jin" username and password "1234"
Then Home page is populated 
And Cards are displayed "true"

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User login into Application with "john" username and password "4321"
Then Home page is populated
And Cards are not displayed "false"

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User sign with following details
| jamil | abcd | jamil@abcd | Bangladesh | 3242353 |
Then Home page is populated
And Cards are not displayed "false"
@RegTest
Scenario Outline: Home page default login
Given User is on landing page
When User login into application with <Username> and password <password>
Then Home page is populated
And Cards are not displayed "true"

Examples: 
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |
|user4    |pass4   |

