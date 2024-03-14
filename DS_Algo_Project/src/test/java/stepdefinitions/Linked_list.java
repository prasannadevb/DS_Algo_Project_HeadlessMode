package stepdefinitions;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.Linked_listPageObjects;
import utilities.Logger_Load;

public class Linked_list {
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
	 Linked_listPageObjects.getInstance().login();
	 Logger_Load.info("the user is on login page");
	}
	@When("the users enters login credentials")
	public void user_enters_login_credentials() {
		Linked_listPageObjects.getInstance().login_credentials();
	}
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   Linked_listPageObjects.getInstance().login_btn();
	}

	@When("user clicks get started on linked list")
	public void user_clicks_get_started_on_linked_list()  {
	
		Linked_listPageObjects.getInstance().Linked_GetBtn();
	}

	@When("user click on introduction link")
	public void user_click_on_introduction_link() {
		Linked_listPageObjects.getInstance().Introduction_Link();
	}

	@When("the user click try here button")
	public void user_clicks_try_here_button() {
		Linked_listPageObjects.getInstance().TryHereIn();
	}
	
	@When("the user writes valid python code (.*) and (.*)$")
	public void user_writes_valid_python_code_print_hello_hello(String input,String output)  {
		
	   Linked_listPageObjects.getInstance().TextEditor_Intr();
	 
	   
	}

	@When("the user writes invalid python code (.*) and (.*)$")
	public void user_writes_invalid_python_code_print_hello_alert(String input,String output)  {
	   
		 Linked_listPageObjects.getInstance().TextEditor_Intr1();
	
	}
	
	@When("the user click run button")
	public void click_run_button() {
		Linked_listPageObjects.getInstance().Run_btn();
		
	}
	@When("alert message appears")
	public void alert_message_appears() {
		Linked_listPageObjects.getInstance().alert_text();
		
	}

@Then("the user is able to see output in console")
	public void user_is_able_to_see_output_in_console() {
Linked_listPageObjects.getInstance().console_Output();
	}

	@When("user clicks creating linked list link")
	public void user_clicks_creating_linked_list_link() {
		Linked_listPageObjects.getInstance().Creating_Linked();
	}
	
	@When("user clicks Types of linked list  link")
	public void user_clicks_types_of_linked_list_link() {
		Linked_listPageObjects.getInstance().Types_Linked();
		
			
	}
	
	@When("user clicks Implement linked list link")
	public void user_clicks_implement_linked_list_link() {
		Linked_listPageObjects.getInstance().Implement_Linked();
	}

	@When("user clicks Traversal  link")
	public void user_clicks_traversal_link() {
		Linked_listPageObjects.getInstance().Traversal_Link();
	}

	@When("user clicks Insertion  link")
	public void user_clicks_insertion_link() {
		Linked_listPageObjects.getInstance().Insertion_Link();
	}

	@When("user clicks Deletion  link")
	public void user_clicks_deletion_link() {
		Linked_listPageObjects.getInstance().Deletion_Link();
	}
	
	@When("user clicks Practice question  link")
	public void user_clicks_practice_question_link() {
		Linked_listPageObjects.getInstance().Practice_Question();
		
	}

	@When("user clicks on signout link")
	public void user_clicks_on_signout_link() {
	    Linked_listPageObjects.getInstance().SignOut_link();
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
		App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}


}

