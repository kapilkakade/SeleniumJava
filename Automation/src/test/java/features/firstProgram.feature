

Feature: Application Login
#@SmokeTest
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with "admin" and password "1234"
Then Home page is displayed
And Cards are displayed


Scenario: User Page default login

Given User is on NetBanking landing page
When User login into application with "user" and password "0953"
Then Home page is displayed
And Cards are displayed

#@RegressionTest
Scenario Outline: User Page default login

Given User is on NetBanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:

		|   Username  |    Password     |
		|  debituser  |     hello123    |
		|  credituser |     hello789    |
		
#@SmokeTest		
Scenario: User page default Sign up

Given User is on Practice landing page
When User Signup into application
| rahul |
| Shetty | 
| contact@email.com |
| 8204393894 |
Then Home page is displayed
And Cards are displayed
