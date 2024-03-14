@tree
Feature: To test the functionality of tree structure
  Scenario Outline: To check Tree page functionality-overview of tree
    Given user is on tree page
    When  user clicks overview of tree in tree page 
    Then user should be redirected to "Overview of Trees" page
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user is able to see the output in console
    
      Examples:
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
   

  Scenario Outline: To check Tree page functionality-Terminologies
    Given user is on tree page
    When  user clicks terminologies in tree page 
    Then user should be redirected to "Terminologies" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user see error msg in alert window
    
     Examples:
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
    
   Scenario: To check Tree page functionality-Types of trees
   	Given user is on tree page
    When  user clicks types of trees in tree page 
    Then user should be redirected to "Types of Trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user clicks run button without entering the code
    Then nothing happens to the page and no error msg is dispalyed
    
   Scenario: To check Tree page functionality-Tree traversals
   	Given user is on tree page
    When  user clicks tree traversals in tree page 
    Then user should be redirected to "Tree Traversals" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user clicks run button without entering the code
    Then nothing happens to the page and no error msg is dispalyed
    
   Scenario Outline: To check Tree page functionality-Traversals-Illustration
   	Given user is on tree page
    When  user clicks tree traversals-illustration in tree page 
    Then user should be redirected to "Traversals-Illustration" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user is able to see the output in console
    
    
     Examples:
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
    
    Scenario Outline: To check Tree page functionality-Binary Trees
    Given user is on tree page
    When  user clicks Binary trees in tree page 
    Then user should be redirected to "Binary Trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user see error msg in alert window
    
    Examples:
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
     
    Scenario: To check Tree page functionality-Types of Binary trees
   	Given user is on tree page
    When  user clicks types of binary trees in tree page 
    Then user should be redirected to "Types of Binary Trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user clicks run button without entering the code
    Then nothing happens to the page and no error msg is dispalyed
    
    Scenario: To check Tree page functionality-Implementation in python
   	Given user is on tree page
    When  user clicks Implementation in python in tree page 
    Then user should be redirected to "Implementation in Python" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user clicks run button without entering the code
    Then nothing happens to the page and no error msg is dispalyed
    
    Scenario Outline: To check Tree page functionality-Binary tree traversals
    Given user is on tree page
    When  user clicks binary tree traversals in tree page 
    Then user should be redirected to "Binary Tree Traversals" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user is able to see the output in console
    
    
  Examples:
    |SheetName				  | RowNumber   |
    |Python code			  | 0				  	|
    
    Scenario Outline: To check Tree page functionality-Implementation of Binary Trees
    Given user is on tree page
    When  user clicks Implementation of Binary Trees in tree page 
    Then user should be redirected to "Implementation of Binary Trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When user writes invalid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user see error msg in alert window
    
     Examples:
     |SheetName				  | RowNumber   |
     |Python code				| 1						|
    
    Scenario: To check Tree page functionality-Applications of Binary trees
   	Given user is on tree page
    When  user clicks Applications of Binary trees in tree page 
    Then user should be redirected to "Applications of Binary trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
    When  user clicks run button without entering the code
    Then nothing happens to the page and no error msg is dispalyed
    
    Scenario Outline: To check Tree page functionality-Binary search Trees
    Given user is on tree page
    When  user clicks Binary search Trees in tree page 
    Then user should be redirected to "Binary Search Trees" page  
    When user clicks the try here button 
    Then user should be redirected to page having editor and run button
     When  user writes valid python code with "<SheetName>" and rownumber <RowNumber> in tree page editor
    And user clicks the run button
    Then  user is able to see the output in console
    
    
    Examples:
     |SheetName				  | RowNumber   |
     |Python code				| 0						|
    
    
    Scenario: To check Tree page functionality-Implementation of Bst
   	Given user is on tree page
    When  user clicks Implementation of BST in tree page 
    Then user should be redirected to "Implementation Of BST" page  
    When user clicks Practice Questions link
    Then user should be redirected to Practice Questions page
    And user clicks on sign out page