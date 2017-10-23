Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  Registration successfully

Given open O2O page
When I click registration link
Then Registration page show I'm a new customer
When Select Title
Then Input First name
Then Input Surname
Then Input Email
Then Input mobile number
Then Input PSW
Then Input Confirmed PSW
When Click Register btn
Then Registration success and show Thank you for registering.
Then I quit browser