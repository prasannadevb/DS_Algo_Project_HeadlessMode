package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import app_hooks.App_Hooks;
import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.LoginPageObjects;
import utilities.Logger_Load;


public class Login {

	@Given("the user is on the DS_Algo introduction page")
	public void the_user_is_on_the_ds_algo_introduction_page() {
	    App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}

	@When("the user clicks on Sign_in button")
	public void the_user_clicks_on_sign_in_button() {
		LoginPageObjects.getInstance().clickSignin();
	}

	@When("the user should be redirected to signin page")
	public void the_user_should_be_redirected_to_signin_page() {
		   String currentURL =App_Hooks.getInstance().getDriver().getCurrentUrl();
		   String expectedURL = "https://dsportalapp.herokuapp.com/login";
		   Assert.assertEquals(currentURL, expectedURL);
		   System.out.println("User is on the signin page");
		   Logger_Load.info("User is on the signin page");
	}

	@Then("the user must able to see {string} link text box")
	public void the_user_must_able_to_see_link_text_box(String string) {
		 boolean status = App_Hooks.getInstance().getDriver().findElement(By.linkText("Register!")).isDisplayed();{
			    if(status)
		    {
			    	Logger_Load.info("User is in login page");
		    }
		 }
	}

	@Given("the user is on the DS_Algo signin page")
	public void the_user_is_on_the_ds_algo_signin_page() {
	    App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	    
	}

	@When("The user clicks login button after leaving the {string} textbox and {string} textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String string, String string2) {
	    LoginPageObjects.getInstance().clickLogin();
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String string) {
		WebElement activeElement = App_Hooks.getInstance().getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	    
	}

	@When("The user clicks login button after entering the {string} textbox and leaves  {string} textbox blank")
	public void the_user_clicks_login_button_after_entering_the_textbox_and_leaves_textbox_blank(String string, String string2) {
		LoginPageObjects.getInstance().enterUsername();
		LoginPageObjects.getInstance().clickLogin();
	    
	}

	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String string) {
		WebElement activeElement = App_Hooks.getInstance().getDriver().switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	@When("the user clicks login button after entering invalid username and invalid password")
	public void the_user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
		LoginPageObjects.getInstance().clearUsername();
		LoginPageObjects.getInstance().invalidUsername();
		LoginPageObjects.getInstance().invalidPassword();
		LoginPageObjects.getInstance().clickLogin();
	}

	@Then("the user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String string) {
		 String message =LoginPageObjects.getInstance().getAlert();
		 System.out.println(message);
		 Logger_Load.error(message);
	}

	@When("The user clicks login button after entering valid username and valid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
		LoginPageObjects.getInstance().clearUsername();
		LoginPageObjects.getInstance().clearPassword();
		LoginPageObjects.getInstance().enterUsername();
		LoginPageObjects.getInstance().enterPassword();
		LoginPageObjects.getInstance().clickLogin();
	}
	
	
	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_be_redirected_to_data_structure_home_page1() {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl();
		String expectedUrl ="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(currentUrl, expectedUrl);
		System.out.println("User is on the Data Structure hompage");
	}
	
	}
