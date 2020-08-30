Feature: The application should be running 

@smoke 
Scenario: first search 
	Given I am on the home page 
	When I search for "educational games" 
	Then I should see the results 
	
@smoke @regression 
Scenario: second search 
	Given I am on the home page 
	When I search for "bright ears" 
	Then I should see more results
	
@smoke 
Scenario: third search 
	Given I am on the home page 
	When I search for "baby grinch" 
	Then I should see the results 