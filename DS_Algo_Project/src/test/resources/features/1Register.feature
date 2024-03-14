
  @register
Feature: Registration process of the user

		
		
		Scenario: This test is to verify the Registration page
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
   
    Scenario: The user tries to Register without username and password
   Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    Then the error "please fill out this field" appears below user name text box
    When user clicks register button after entering user name with other fields empty
    Then the error "please fill out this field" appears below password  text box
    
    Scenario: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When the user clicks register button after entering user name and password with password confirmation field empty
    Then the error "please fill out this field" appears below password confirmation text box
    
    Scenario: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When user clicks register button after entering the user name with space bar char other than digits 
    Then user is not able to see error msg after entering invalid data
    And user redirected to empty password textbox
    
    Scenario: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When user clicks register button after entering password with numeric data
    Then user is not able to see error message after entering invalid data
    And user should see an empty password confirmation textbox
    
    Scenario: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When user clicks register button after entering password with characters less than eight
    Then user is not able to see error message after entering invalid data
    And user redirected to register button
    
    Scenario: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When the user enters the username as "quantum@testers"
    When user clicks register button after entering different passwords in password and password confirmation fields
    Then user is not able to see error message after entering invalid data
    And user should able to see an password warning message "password_mismatch:the two password fields didn't match"
     
   
   Scenario Outline: The user tries to Register
    Given given the user is on the home page
    When  the user clicks the register button
    Then  the user should see the registration page
    When user clicks register button after entering valid "<username>","<password>" and password confirmation related boxes
    Then the user should be redirected to homepage of DSAlgo
  
    Examples: 
      | username        | password | 
      | demo@testers |numpyninja1234|
  

  