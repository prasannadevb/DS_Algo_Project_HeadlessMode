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
import page_model.StackPageObjects;
import utilities.ExcelReader;
import utilities.Logger_Load;

public class Stack {
	
	@Given("the user is on the sign in page")
	public void the_user_is_on_the_sign_in_page() {
		App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	}

	@When("the user enters login credentials")
	public void user_enters_login_credentials() {
		StackPageObjects.getInstance().enterUsername();
		StackPageObjects.getInstance().enterPassword();
		StackPageObjects.getInstance().clickLogin();

	}

	@Then("the user navigates to home page")
	public void user_navigates_to_home_page() {
		String currentUrl = App_Hooks.getInstance().getDriver().getCurrentUrl();
		String expectedUrl ="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(currentUrl, expectedUrl);
		System.out.println("User is on the hompage");

	}

	@Given("user is on hompage")
	public void user_is_on_hompage() {
	    App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}

	@When("user clicks get started on Stack panel")
	public void user_clicks_get_started_on_stack_panel() {
		StackPageObjects.getInstance().stackGetStart();
	}

	@Then("user should be directed to Stack page")
	public void user_should_be_directed_to_stack_page() {
	    Logger_Load.info("user is on stack page");
	}

	@When("user clicks operations in stack page")
	public void user_clicks_operations_in_stack_page() throws InterruptedException {
		StackPageObjects.getInstance().clickstackOperations();
	}

	@Then("should be directed to operations in stack page")
	public void should_be_directed_to_operations_in_stack_page() {
	    
	}

	@When("user clicks try here button")
	public void user_clicks_try_here_button() throws InterruptedException {
		StackPageObjects.getInstance().tryhere();
	}

	@When("user writes valid python code with {string} and rownumber {int}")
	public void user_writes_valid_python_code_with_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		StackPageObjects.getInstance().validCode(text);
		}

	@When("click run button")
	public void click_run_button() throws InterruptedException {
		StackPageObjects.getInstance().runBtn();
	}

	@Then("user is able to see output in console")
	public void user_is_able_to_see_output_in_console() {
	   String output=StackPageObjects.getInstance().getOutput();
	   System.out.println(output);
	}

	@When("user clicks implementation in stack page")
	public void user_clicks_implementation_in_stack_page() throws InterruptedException {
		StackPageObjects.getInstance().clickstackImplementation();
	}

	@Then("user should be directed to implementation page")
	public void user_should_be_directed_to_implementation_page() {
	    
	}

	@When("user writes invalid python code with {string} and rownumber {int}")
	public void user_writes_invalid_python_code_with_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		StackPageObjects.getInstance().invalidCode(text);
		
		

	}

	@When("click run button on implementation page")
	public void click_run_button_on_implementation_page() throws InterruptedException {
		StackPageObjects.getInstance().runBtn();
		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		System.out.println(actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, "NameError: name 'hello' is not defined on line 1");
		alert.accept();
	}

	@When("user clicks applications in stack page")
	public void user_clicks_applications_in_stack_page() throws InterruptedException {
		StackPageObjects.getInstance().clickstackapplication();
	}

	@When("user clicks practice question in stack page")
	public void user_clicks_practice_question_in_stack_page() throws InterruptedException {
		StackPageObjects.getInstance().practiceQuestions();
	}

	@Then("user clicks sign out")
	public void user_clicks_sign_out() {
		StackPageObjects.getInstance().signOut();
	}

}