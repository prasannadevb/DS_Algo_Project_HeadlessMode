@Queue

Feature: Data Structure Home page
 
Scenario Outline: Clicking the get started in Queue

Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When the user clicks the  Implementation of Queue in Python button 
When The user clicks Try Here button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in queue page
And clicks the run button on queue page
Then User is able to see the output in console

Examples: 
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|


Scenario Outline: Gettin started in Queue with other topic
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When The user clicks Implementation using Collections.deque page 
When The user clicks Try Here button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in queue page
And clicks the run button on queue page
Then User is able to see the output in console

Examples: 
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
   

Scenario Outline: Queue invalid passing code
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When The user clicks Implementation using array
When The user clicks Try Here button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> in queue page
And clicks the run button on queue page
Then The user should be able to see an error message in alert window
  
  
  Examples: 
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
   
   
   Scenario Outline: Getting started in Queue 
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When The user clicks Implementation using array
When The user clicks Try Here button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in queue page
And clicks the run button on queue page
Then User is able to see the output in console

Examples: 
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
   

Scenario Outline: Getting started in Queue with another topic
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When The user clicks Queue Operations 
When The user clicks Try Here button
Then The user should be redirected to a page with the url "https://dsportalapp.herokuapp.com/tryEditor"
When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in queue page
And clicks the run button on queue page
Then User is able to see the output in console

Examples: 
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
    
Scenario: Practice Question Paper
Given the user is on the DS_Algo Home Page
When the user clicks  Get Started button on the Queue
When The user clicks Queue Operations 
When  user clicks the Practice QP
Then  user finds the page is blank