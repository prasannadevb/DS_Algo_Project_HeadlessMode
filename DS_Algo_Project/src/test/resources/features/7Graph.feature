@Graph
Feature: To test graph page


Scenario Outline: getting started to graph page
Given user clicks the get started button below the graph 
When the user clicks graph link
When the user clicks try here button
Then the user should be directed to the url "https://dsportalapp.herokuapp.com/tryEditor"
When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in graph page
And  user should clicks the run button
Then the user should be able to see the output

Examples: 
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
    
    
Scenario Outline: inspecting another topic in queue
Given user clicks the get started button below the graph
When the user clicks the graph representation
When the user clicks try here button
Then the user should be directed to the url "https://dsportalapp.herokuapp.com/tryEditor"
When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> in graph page
And  user should clicks the run button
Then the user should be able to see the error msg in the alert window

Examples: 
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
   
Scenario: practice Questions
Given user clicks the get started button below the graph 
When the user clicks graph link
When the user clicks the practice question 
Then the user finds the page is blank
