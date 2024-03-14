@DS_Introductionpage
Feature: Data Structure Home page - DS_Introduction
 
	 
 Scenario Outline: Home Page
   Given the user is on the DS Algo Home Page
   When the user clicks  Get Started button below the Data structures-Introduction
   When the user clicks Time Complexity link
   When The user clicks Try Here  button of Time Complexity page
   When user adds invalid code with "<SheetName>" and rownumber <RowNumber>
   And Click the Run Button
   Then The user should able to see an error message in alert window
   
   Examples:
    |SheetName     |   RowNumber   |
    |Python Code   |   1     |
    
    	
   
   
   Scenario Outline: Home Page
   Given the user is on the DS Algo Home Page
   When the user clicks  Get Started button below the Data structures-Introduction
   When the user clicks Time Complexity link
   When The user clicks Try Here  button of Time Complexity page
   When user adds valid python code with "<SheetName>" and rownumber <RowNumber>
   And Click the  python page run Button
   Then The user should able to see output in the console
  
    
    Examples:
    |     SheetName     |   RowNumber   |
    |     Python Code   |   0      |
    
    
    
   Scenario: Python editor
   Given The user is on the Time Complexity Data Structure Home Page
   When The user clicks Practice Questions link
   Then the user clicks the signout button in DS introduction page