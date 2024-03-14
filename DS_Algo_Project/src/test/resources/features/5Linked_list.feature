@Linkedlist
 Feature: Getting Started to Signin DS_Algo Portal 

  Scenario Outline: To check Linked List page functionality
    
    When  user clicks get started on linked list
    When  user click on introduction link
    When  the user click try here button
    When  the user writes valid python code <input> and <output>
    And   the user click run button
    Then  the user is able to see output in console
    
    Examples:
    |    input		  |  output	|
    |print 'hello'	|  hello	|
    
    Scenario Outline: To check Linked List page functionality
    
    When  user clicks get started on linked list
   
    When  user click on introduction link
    When  the user click try here button
    When  the user writes invalid python code <input> and <output>
    And   the user click run button
    And alert message appears
    Then  the user is able to see output in console
    
    Examples:
   |input				| output	|
   |print hello	|alert		|
    
  
    
   Scenario Outline: check Linked List page functionality
   	When  user clicks get started on linked list
   
     When user clicks creating linked list link 
    When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
    
    Examples:
   |input				| output	|
   |print 'hello'|hello	|
    
   
    
  Scenario Outline: To check Linked List page functionality
   	When  user clicks get started on linked list
     When user clicks Types of linked list  link 
     When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
    Examples:
    |input				| output	|
   |print 'hello'	|hello		|
     
    
    Scenario Outline: To check Linked List page functionality
   		When  user clicks get started on linked list
     When user clicks Implement linked list link 
    When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
    Examples:
     |input				| output	|
   |print 'hello'	|hello		|
    
    
    
    
    Scenario Outline: To check Linked List page functionality
   	When  user clicks get started on linked list
     When user clicks Traversal  link 
    When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
    Examples:
     |input				| output	|
   |print 'hello'	|hello		|
    
    
     Scenario Outline: To check Linked List page functionality
   	When  user clicks get started on linked list
    
     When user clicks Insertion  link 
    When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
    
     Examples:
      |input				| output	|
   |print 'hello'	|hello			|
     
    
    
     Scenario Outline: check Linked List page functionality
   	When  user clicks get started on linked list
   
     When user clicks Deletion  link 
    When the user click try here button
    
    And  the user click run button
    Then the user is able to see output in console
     Examples:
    |input				| output	|
   |print 'hello'	|hello		|
     
    
   Scenario: check Linked List page functionality
   When  user clicks get started on linked list
     When user clicks Deletion  link
     When user clicks Practice question  link
     And user clicks on signout link
     Then user navigates to homepage