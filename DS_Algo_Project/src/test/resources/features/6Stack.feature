@Stack

Feature: Stack page functionality

  
  Scenario Outline: To check Stack page functionality-operations in stack
    Given user is on hompage
    When  user clicks get started on Stack panel
    Then  user should be directed to Stack page
    When  user clicks operations in stack page
    Then  should be directed to operations in stack page
    When  user clicks try here button
    When  user writes valid python code with "<SheetName>" and rownumber <RowNumber>
    And   click run button
    Then  user is able to see output in console
    
    
    Examples:
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
    
  Scenario Outline: To check Stack page functionality-Implementation
   	Given user is on hompage
    When user clicks get started on Stack panel
    Then user should be directed to Stack page
    When user clicks implementation in stack page
    Then user should be directed to implementation page
    When user clicks try here button
    When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> 
    And  click run button on implementation page
    
     Examples:
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
    
   
   Scenario: To check Stack page functionality-Application Practice
   	Given user is on hompage
    When user clicks get started on Stack panel
    Then user should be directed to Stack page
    When user clicks applications in stack page
    And user clicks practice question in stack page
    Then user clicks sign out