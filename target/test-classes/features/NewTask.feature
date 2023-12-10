Feature: Create New Task 

Scenario: To validate NewTask is created 
	Given Launched web and hit url 
	And enter credentials "Nitink@testleaf.com" and "Chicago@1518"
	And App launcher menu click
	And view all and Type "Task" in App Luancher 
	And click on task link 
	And New button click under dropdown icon 
	When Enter subject as "Bootcamp" 
	And Select status as Waiting on someone else 
	And Save the task  
	Then verify the Task created message 
    