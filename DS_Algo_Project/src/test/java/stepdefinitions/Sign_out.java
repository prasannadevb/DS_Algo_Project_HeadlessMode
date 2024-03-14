package stepdefinitions;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.Sign_outPageObjects;

public class Sign_out {
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	    App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}

	@When("the user clicks the signout button")
	public void the_user_clicks_the_signout_button() {
	   Sign_outPageObjects.getInstance().clickSignoutBtn();
	}

	@Then("the user will be redirected to the homepage")
	public void the_user_will_be_redirected_to_the_homepage() {
		App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}



}
