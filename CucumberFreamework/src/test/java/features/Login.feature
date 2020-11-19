Feature: Application Login 

Scenario: Home pgae default login 
	Given User is on Net Banking Landing page 
	When User login into application with username and password 
	Then Home page is populated 
	And Cards are displayed 
	
Scenario: Home pgae default login 
	Given User is on Net Banking Landing page 
	When User login into application with username "John" and password "1234" 
	Then Home page is populated 
	And Cards are displayed