Feature: Create New Lead 

Scenario: To validate NewLead is created 
	Given Launch browser and enter salesforce url 
	And Login with credentials "Nitink@testleaf.com" and "Chicago@1518"
	And Click on toggle menu from left corner 
	And Click View All and click Sales from App Launcher
	And Click on the Leads tab
	And Click New button under dropdown icon 
	When select salutation 
	And Enter firstname as "Nitin"
	And Enter lastname as "Kar"
	And Enter company as "CTS"
	And Select status
	And click on Save
	Then verify the Leads created success message 
    