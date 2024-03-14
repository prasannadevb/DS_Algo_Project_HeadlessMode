@array
Feature: Testing the Array Page
	

  Scenario: Verify user is able to navigate into DS_Algo Array Page
    Given the user is on the Home Page
    When  the user clicks the get started button below the Array
    Then  the user should be redirected to the page whose title is "Array" and the url is "https://dsportalapp.herokuapp.com/array/"
   
  Scenario: Verify Arrays in Python link redirects to Arrays in Python page.
    Given the user is on the Array page
    When  the user clicks Arrays in Python link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/array/arrays-in-python/" page
  
  Scenario: Verify the Arrays using List menu navigates to Arrays Using List page
    Given the user is on the Arrays in Python Page
    When  the user clicks Arrays Using List link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/array/arrays-using-list/" page 
    
   Scenario: Verify the Basic Operations in Lists menu navigates to Basic Operations in Lists page
    Given the user is on the Arrays Using List Page
    When  the user clicks Basic Operations in Lists Link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/" page
    
   Scenario: Verify the Applications of Array navigates to Applications of Array page
    Given the user is on the Basic Operations in Lists Page
    When  the user clicks Applications of Array Link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/array/applications-of-array/" page
    
  Scenario: Verify the Try here button is redirecting the user to the python editor.
    Given  the user is on the Arrays in Python Page
    When   the user clicks Try Here button
    Then   the user should be redirected to Python Editor with the url as "https://dsportalapp.herokuapp.com/tryEditor"
    
  Scenario: Verify the Python Editor is throwing error when an invalid code is given, compiles the program and produces a alert window 
    Given  the user is on the python editor page
    When   the user clicks the run button without entering any code in the editor 
    Then   Nothing happens to the page and no error message is displayed
    When   the user writes an invalid code in Editor like "printf('bindu')"
    And    clicks the run button
    Then   the user should able to see an error message in alert window
    
   Scenario: Verify the Python Editor when an valid code is given
    Given  the user is on the python editor page
    When   the user enters a valid code in Editor like "print('bindu')"
    And    clicks the run button
    Then   the user should able to see output in the console
    
   
   Scenario: Verify the practice questions page has all the 4 links mentioned.
    Given the user is on the Applications Of Array Page
    When  the user clicks on the Practice Questions link
    Then  the user should be redirected to practice page having links like "Search the array" ,"Max Consecutive Ones","Find Numbers with Even Number of Digits" and "Squares of a Sorted Array."
    
    
  Scenario: Verify Practice Question 1 page has the question, code editor, run and submit buttons
    Given the user is on the Practice page 
    When  the user clicks search the array link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/question/1"
   
  Scenario: Verify Practice Question 2 page has the question, code editor, run and submit buttons
    Given the user is on the Practice page 
    When  the user clicks max consecutive ones link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/question/2" 
    
  Scenario: Verify Practice Question 3 page has the question, code editor, run and submit buttons
    Given the user is on the Practice page 
    When  the user clicks find numbers with even number of digits link
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/question/3"
    
 Scenario: Verify Practice Question 4 page has the question, code editor, run and submit buttons
    Given the user is on the Practice page 
    When  the user clicks squares of a sorted array
    Then  the user should be redirected to "https://dsportalapp.herokuapp.com/question/4"
    

 Scenario: verify submitting the practice question with no code in search the array link
	Given the user is on the practice question page 
	When  the user clicks search the array link
	Then  the user should be directed to search the array question page
	When the user clicks on the run button without entering any code
	Then the user should see an alert contains "bad input on line 2"
	When  the user clicks on the submit button without entering any code
	Then  the user sees in search the array "Error occurred during submission" 
	
 
 Scenario: verify submitting the practice question with no code in max consecutive ones
	Given the user is on the practice question page
	When  the user clicks max consecutive ones
	When the user clicks on the run button without entering any code
	Then the user should see an alert contains "bad input on line 2"
	When the user clicks on the submit button without entering any code
	Then user sees in max consective ones "Error occurred during submission" 
	

 Scenario: verify running the practice question with no code in find numbers with even number of digits
	Given the user is on the practice question page
	When  the user clicks find numbers with even number of digits
	When the user clicks on the run button without entering any code
	Then the user should see an alert contains "bad input on line 2"
	When the user clicks on the submit button without entering any code
	Then the user should see in find numbers "Error occurred during submission" 
	
	@question
	Scenario: verify submitting the practice question with no code in squares of a sorted array
	Given the user is on the practice question page
	When  the user clicks squares in sorted array
	When the user clicks on the run button without entering any code
	Then the user should see an alert contains "bad input on line 2"
	When the user clicks on the submit button without entering any code in squares of a sorted array
	Then the user should see "No tests were collected" in sorted array
	Then the user should be redirected to the homepage
	
	@question1
  Scenario: verify submitting the practice question with valid code in search the array link
  Given the user is on the practice question page 
	When  the user clicks search the array link
	Then  the user should be directed to search the array question page
	When  the user gives a valid code
	Then the user should see the output in console
	Then the user clicks the signout button in the arraypage