package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Assert;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.GraphPageObjects;
import utilities.ExcelReader;


public class Graph {
	
	
	@Given("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	}

	@When("user must enter the username and password")
	public void user_must_enter_the_username_and_password() {
		GraphPageObjects.getInstance().enterUsername();
		GraphPageObjects.getInstance().enterPassword();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		GraphPageObjects.getInstance().clickLogin();
	}

	@Given("user clicks the get started button below the graph")
	public void user_clicks_the_get_started_button_below_the_graph() {
	   GraphPageObjects.getInstance().graphGetStart();
	}

	@When("the user clicks graph link")
	public void the_user_clicks_graph_link() {
	    GraphPageObjects.getInstance().clickGraphLink();
	}

	@When("the user clicks try here button")
	public void the_user_clicks_try_here_button() {
	    GraphPageObjects.getInstance().clickTryhere();
	}

	@Then("the user should be directed to the url {string}")
	public void the_user_should_be_directed_to_the_url(String string) {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl();
		String expectedUrl ="https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(currentUrl, expectedUrl);
	}

	@When("user writes valid python code with {string} and rownumber {int} in graph page")
	public void user_writes_valid_python_code_with_and_rownumber_in_graph_page(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		GraphPageObjects.getInstance().validCode(text);
		}

	
	@Then("user should clicks the run button")
	public void user_should_clicks_the_run_button() {
	   try {
		GraphPageObjects.getInstance().runBtn();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	@Then("the user should be able to see the output")
	public void the_user_should_be_able_to_see_the_output() {
		String output=GraphPageObjects.getInstance().getOutput();
		System.out.println(output);
	}

	@When("the user clicks the graph representation")
	public void the_user_clicks_the_graph_representation() {
	    GraphPageObjects.getInstance().clickGraphRepresentation();
	}

	@When("user writes invalid python code with {string} and rownumber {int} in graph page")
	public void user_writes_invalid_python_code_with_and_rownumber_in_graph_page(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		GraphPageObjects.getInstance().invalidCode(text);
	}


	@Then("the user should be able to see the error msg in the alert window")
	public void the_user_should_be_able_to_see_the_error_msg_in_the_alert_window() {
		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		System.out.println(actualErrorMessage);
		Assert.assertTrue(actualErrorMessage.contains("Error"));
		alert.accept();
	}

	@When("the user clicks the practice question")
	public void the_user_clicks_the_practice_question() {
	    try {
			GraphPageObjects.getInstance().practiceQuestions();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("the user finds the page is blank")
	public void the_user_finds_the_page_is_blank() {
	   GraphPageObjects.getInstance().clickSignout();
	}



}