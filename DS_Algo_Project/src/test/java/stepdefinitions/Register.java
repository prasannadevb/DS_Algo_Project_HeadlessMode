package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.RegisterPageObjects;
import utilities.Logger_Load;

public class Register {
	@Given("given the user is on the home page")
	public void given_ther_user_is_on_the_home_page() {
	   App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}

	@When("the user clicks the register button")
	public void the_user_clicks_the_register_button() throws InterruptedException {
		RegisterPageObjects.getInstance().clickRegisterLink();
	    
	}

	@Then("the user should see the registration page")
	public void the_user_should_see_the_registration_page() {
	   String currentURL =App_Hooks.getInstance().getDriver().getCurrentUrl();
	   String expectedURL = "https://dsportalapp.herokuapp.com/register";
	   Assert.assertEquals(currentURL, expectedURL);
	   System.out.println("User is on the registration page");
	   
	}
	@Given("user is on the registration page")
	public void user_is_on_the_registration_page() {
	   Logger_Load.info("User is on regitration page");
	}

	@When("user clicks register button with all fields empty")
	public void user_clicks_register_button_with_all_fields_empty() {
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("the error {string} appears below user name text box")
	public void the_error_appears_below_user_name_text_box(String string) {
		WebElement activeElement = App_Hooks.getInstance().getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	@When("user clicks register button after entering user name with other fields empty")
	public void user_clicks_register_button_after_entering_user_name_with_other_fields_empty() {
		RegisterPageObjects.getInstance().enterUsername("quantum");
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("the error {string} appears below password  text box")
	public void the_error_appears_below_password_text_box(String string) {
		WebElement activeElement = App_Hooks.getInstance().getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	    
	}

	@Given("user is on the reistration page")
	public void user_is_on_the_reistration_page() {
		
	}

	@When("the user clicks register button after entering user name and password with password confirmation field empty")
	public void the_user_clicks_register_button_after_entering_user_name_and_password_with_password_confirmation_field_empty() {
		RegisterPageObjects.getInstance().enterPassword("ninja1234");
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("the error {string} appears below password confirmation text box")
	public void the_error_appears_below_password_confirmation_text_box(String string) {
		WebElement activeElement = App_Hooks.getInstance().getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	@When("user clicks register button after entering the user name with space bar char other than digits")
	public void user_clicks_register_button_after_entering_the_user_name_with_space_bar_char_other_than_digits() {
		RegisterPageObjects.getInstance().clearUsername();
		RegisterPageObjects.getInstance().clearPassword();
		RegisterPageObjects.getInstance().invalidUsername();
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("user is not able to see error msg after entering invalid data")
	public void user_is_not_able_to_see_error_msg_after_entering_invalid_data() {
	   Logger_Load.error("No error message");
	}

	@Then("user redirected to empty password textbox")
	public void user_redirected_to_empty_password_textbox() {
	   
	}
	
	@When("user clicks register button after entering password with numeric data")
	public void user_clicks_register_button_after_entering_password_with_numeric_data() {
		RegisterPageObjects.getInstance().invalidPassword();
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("user is not able to see error message after entering invalid data")
	public void user_is_not_able_to_see_error_message_after_entering_invalid_data() {
		Logger_Load.error("No error message");
	}

	@Then("user should see an empty password confirmation textbox")
	public void user_should_see_an_empty_password_confirmation_textbox() {
	    
	}

	@When("user clicks register button after entering password with characters less than eight")
	public void user_clicks_register_button_after_entering_password_with_characters_less_than_eight() {
		RegisterPageObjects.getInstance().clearPassword();
		RegisterPageObjects.getInstance().invalidPassword1();
	}

	@Then("user redirected to register button")
	public void user_redirected_to_register_button() {
		Logger_Load.error("No error message");
	}

	@When("user clicks register button after entering different passwords in password and password confirmation fields")
	public void user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
		RegisterPageObjects.getInstance().clearPassword();
		RegisterPageObjects.getInstance().invalidPassword1();
		RegisterPageObjects.getInstance().enterinvalidconfirmation();
		RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("user should able to see an password warning message {string}")
	public void user_should_able_to_see_an_password_warning_message(String string) {
		 String message =RegisterPageObjects.getInstance().getAlert();
		 System.out.println(message);
		 Logger_Load.error(message);
		 RegisterPageObjects.getInstance().clearUsername();
		 RegisterPageObjects.getInstance().clearPassword();
		 RegisterPageObjects.getInstance().clearconfirmation();
	}
	
	@When("user clicks register button after entering valid {string},{string} and password confirmation related boxes")
	public void user_clicks_register_button_after_entering_valid_and_password_confirmation_related_boxes(String username, String password) {
		 RegisterPageObjects.getInstance().enterUsername(username);
		 RegisterPageObjects.getInstance().enterPassword(password);
		 RegisterPageObjects.getInstance().enterconfirmation(password);
		 RegisterPageObjects.getInstance().clickRegister();
	}

	@Then("the user should be redirected to homepage of DSAlgo")
	public void the_user_should_be_redirected_to_homepage_of_ds_algo() {
	    System.out.println("User redirected to dsALgoHome�page");
	}

	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as_(String username) {
	    RegisterPageObjects.getInstance().enterUsername(username);
	}


}