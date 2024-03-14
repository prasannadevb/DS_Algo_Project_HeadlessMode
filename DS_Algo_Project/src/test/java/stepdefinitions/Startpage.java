package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.HomePageObjects;
import page_model.StartpagePageObjects;

public class Startpage {
	
	@Given("user is on the get started page")
	public void user_is_on_the_get_started_page() {
		
		App_Hooks.getInstance().getDriver().get(Constants.URL);
	    
	}

	@When("user clicks the get start button")
	public void user_clicks_the_get_start_button() throws InterruptedException {
		StartpagePageObjects.getInstance().algo_Startpage();
	}

	@Then("user should see the homepage")
	public void user_should_see_the_homepage() {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl(); 
		String expectedUrl ="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(currentUrl, expectedUrl);
		System.out.println("User is on the hompage");
		 
	}
	

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	    App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}

	@When("user clicks on the get started button in data Structure introduction")
	public void user_clicks_on_the_get_started_button_in_data_structure_introduction() {
	    StartpagePageObjects.getInstance().home_Startpage();
	}

	@Then("you are not logged in statement is displayed")
	public void you_are_not_logged_in_statement_is_displayed() {
	   String message =StartpagePageObjects.getInstance().getAlert();
	   System.out.println(message);
	}
}