Feature: Alert message for create work type 

Scenario: To validate Alert displayed for mandatory fields while creating work type
	Given Launch browser and enter salesforce url 
	And Login with credentials "Nitink@testleaf.com" and "Chicago@1518"
	And Click on toggle menu from left corner 
	And select view all and Type "work type" in App Luancher 
	And work type link click
	And new button click 
	When Enter Work Type Name as "Bootcamp" 	
	And save edit click  
	Then verify the Alert message