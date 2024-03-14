

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
import page_model.QueuePageObjects;
import utilities.ExcelReader;

public class Queue {
	
	@Given("user navigates to the login page")
	public void user_navigates_to_the_login_page() {
		App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		QueuePageObjects.getInstance().enterUsername();
		QueuePageObjects.getInstance().enterPassword();
	}

	@Then("user must be logged in")
	public void user_must_be_logged_in() {
		QueuePageObjects.getInstance().clickLogin();
	}

	@Given("the user is on the DS_Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl();
		String expectedUrl ="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(currentUrl, expectedUrl);
		System.out.println("User is on the hompage");
	}

	@When("the user clicks  Get Started button on the Queue")
	public void the_user_clicks_get_started_button_on_the_queue() {
	    QueuePageObjects.getInstance().queueGetStart();
	}

	@When("the user clicks the  Implementation of Queue in Python button")
	public void the_user_clicks_the_implementation_of_queue_in_python_button() {
	    QueuePageObjects.getInstance().clickImplementationLink();
	}
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	    QueuePageObjects.getInstance().clickTryhere();
	}

	

	@Then("The user should be redirected to a page with the url {string}")
	public void the_user_should_be_redirected_to_a_page_with_the_url(String string) {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl();
		String expectedUrl ="https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(currentUrl, expectedUrl);
	}

	@When("user writes valid python code with {string} and rownumber {int} in queue page")
	public void user_writes_valid_python_code_with_and_rownumber_in_queue_page(String sheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		QueuePageObjects.getInstance().validCode(text);
		}
	

	@When("clicks the run button on queue page")
	public void clicks_the_run_button_on_queue_page() {
	   try {
		QueuePageObjects.getInstance().runBtn();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		String output=QueuePageObjects.getInstance().getOutput();
		System.out.println(output);
	}





	@When("The user clicks Implementation using Collections.deque page")
	public void the_user_clicks_implementation_using_collections_deque_page() {
	   QueuePageObjects.getInstance().clickCollection();
	}




	@When("The user clicks Implementation using array")
	public void the_user_clicks_implementation_using_array() {
	    QueuePageObjects.getInstance().clickArray();
	}

	@When("user writes invalid python code with {string} and rownumber {int} in queue page")
	public void user_writes_invalid_python_code_with_and_rownumber_in_queue_page(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		QueuePageObjects.getInstance().invalidCode(text);
	}

	@Then("The user should be able to see an error message in alert window")
	public void the_user_should_be_able_to_see_an_error_message_in_alert_window() {
		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		System.out.println(actualErrorMessage);
		Assert.assertTrue(actualErrorMessage.contains("Error"));
		alert.accept();
	}

	@When("The user clicks Queue Operations")
	public void the_user_clicks_queue_operations() {
	  QueuePageObjects.getInstance().clickOperation();
	}

	@When("user clicks the Practice QP")
	public void user_clicks_the_practice_qp() {
	    try {
			QueuePageObjects.getInstance().practiceQuestions();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("user finds the page is blank")
	public void user_finds_the_page_is_blank() {
	    QueuePageObjects.getInstance().clickSignout();
	}



}