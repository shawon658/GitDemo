Feature: Application Login

@SanityTest
Scenario: Home page default login
Given User is on landing page
When User login into Application with "jin" username and password "1234"
Then Home page is populated 
And Cards are displayed "true"


