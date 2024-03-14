package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import app_hooks.App_Hooks;
import constants.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_model.ArrayPageObjects;
import page_model.HomePageObjects;
import utilities.Common_Utils;

public class Array {


	@Given("the user is on the Home Page")
	public void the_user_is_on_the_home_page() {
		App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);

	}

	@When("the user clicks the get started button below the Array")
	public void the_user_clicks_the_get_started_button_below_the_array()  {

		try {
			HomePageObjects.getInstance().clickGetStarted();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Then("the user should be redirected to the page whose title is {string} and the url is {string}")
	public void the_user_should_be_redirected_to_the_page_whose_title_is_and_the_url_is(String expectedTitle, String expectedURL) {
		String actualTitle =  App_Hooks.getInstance().getDriver().getTitle(); 
		String actualURL   =  App_Hooks.getInstance().getDriver().getCurrentUrl();

		System.out.println("Actual title"+ actualTitle);
		System.out.println("Expected title"+ expectedTitle);
		System.out.println("Actual URL"+ actualURL);
		System.out.println("Expected URL"+ expectedURL);
		Assert.assertEquals(actualURL, expectedURL);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {

	}

	@Given("the user is on the Array page")
	public void the_user_is_on_the_array_page() {
		App_Hooks.getInstance().getDriver().get(Constants.ARRAYPAGE);
	}

	@When("the user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link()  {
		ArrayPageObjects.getInstance().clickArraysinPythonBtn();
	}

	@Then("the user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String expectedURL)  {
		
		String actualURL =  App_Hooks.getInstance().getDriver().getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
	}


	@Given("the user is on the Arrays Using List Page")
	public void the_user_is_on_the_arrays_using_list_page() {
		App_Hooks.getInstance().getDriver().get(Constants.ARRAYSUSINGLIST);
	}
	@When("the user clicks Basic Operations in Lists Link")
	public void the_user_clicks_basic_operations_in_lists_link()  {
		ArrayPageObjects.getInstance().clickBasicOperationsinLists();
	}	

	@Given("the user is on the Basic Operations in Lists Page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		App_Hooks.getInstance().getDriver().get(Constants.BASICOPERATIONSINLISTS);
	}

	@When("the user clicks Applications of Array Link")
	public void the_user_clicks_applications_of_array_link() {
		ArrayPageObjects.getInstance().clickApplicationsOfArray();

	}

	@Given("the user is on the Arrays in Python Page")
	public void the_user_is_on_the_arrays_in_python_page() {
		App_Hooks.getInstance().getDriver().get(Constants.ARRAYSINPYTHON);
	}

	@When("the user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		ArrayPageObjects.getInstance().clickArraysUsingList();
	}


	@When("the user clicks Try Here button")
	public void the_user_clicks_try_here_button() throws InterruptedException {
		ArrayPageObjects.getInstance().clickTryhere();
	}

	@Then("the user should be redirected to Python Editor with the url as {string}")
	public void the_user_should_be_redirected_to_python_editor_with_the_url_as(String expectedURL) {
		String actualURL =  App_Hooks.getInstance().getDriver().getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
	}

	@Given("the user is on the python editor page")
	public void the_user_is_on_the_python_editor_page() {
		try {
			Thread.sleep(1000);
			App_Hooks.getInstance().getDriver().get(Constants.EDITORBOX);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("the user clicks the run button without entering any code in the editor")
	public void the_user_clicks_the_run_button_without_entering_any_code_in_the_editor() {

	}

	@When("the user writes an invalid code in Editor like {string}")
	public void the_user_writes_an_invalid_code_in_editor_like(String invalidCode) {
		try {
			Thread.sleep(1000);
			ArrayPageObjects.getInstance().enterCode(invalidCode);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@When("clicks the run button")
	public void clicks_the_run_button()  {
		ArrayPageObjects.getInstance().clickRunBtn();

	}

	@Then("the user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {

		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		Assert.assertEquals(actualErrorMessage, "NameError: name 'printf' is not defined on line 1");
		alert.accept();

	}


	@When("the user enters a valid code in Editor like {string}")
	public void the_user_enters_a_valid_code_in_editor_like(String validCode) {
		
			ArrayPageObjects.getInstance().enterValidCode(validCode);
		
		}

	@Then("the user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console()  {

		String actualOutput = null;
		actualOutput = ArrayPageObjects.getInstance().getOutput();
		Assert.assertEquals(actualOutput, "bindu");


	}

	@Given("the user is on the Applications Of Array Page")
	public void the_user_is_on_the_applications_of_array_page1() {
		App_Hooks.getInstance().getDriver().get(Constants.APPLICATIONSOFARRAY);

	}
	@When("the user clicks on the Practice Questions link")
	public void the_user_clicks_on_the_practice_questions_link() {
		ArrayPageObjects.getInstance().clickPracticeQuestions();
	}

	@Then("the user should be redirected to practice page having links like {string} ,{string},{string} and {string}")
	public void the_user_should_be_redirected_to_practice_page_having_links_like_and(String expectedURL1, String expectedURL2, String expectedURL3, String expectedURL4) {
		App_Hooks.getInstance().getDriver().get(Constants.PRACTICEQUESTIONS);
	}

	@Given("the user is on the Practice page")
	public void the_user_is_on_the_practice_page() {
		App_Hooks.getInstance().getDriver().get(Constants.PRACTICEQUESTIONS);
	}

	@When("the user clicks search the array link")
	public void the_user_clicks_search_the_array_link() {
		ArrayPageObjects.getInstance().clicksearchTheArray();
	}
	@Then("the user should be directed to search the array question page")
	public void the_user_should_be_directed_to_search_the_array_question_page() {
		App_Hooks.getInstance().getDriver().get(Constants.PRACTICEQUESTION1);
	}

	@When("the user clicks max consecutive ones link")
	public void the_user_clicks_max_consecutive_ones_link() {
		ArrayPageObjects.getInstance().clickmaxConsecutiveOnes();
	}

	@Then("the user should be redirected to {string}")
	public void the_user_should_be_redirected_to(String url) {
		App_Hooks.getInstance().getDriver().get(url);
	}

	@When("the user clicks find numbers with even number of digits link")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
		ArrayPageObjects.getInstance().clickfindNumbers();
	}

	@When("the user clicks squares of a sorted array")
	public void the_user_clicks_squares_of_a_sorted_array() {
		ArrayPageObjects.getInstance().clicksquaresOfSortedArray();
	}


	@Given("the user is on the practice question page")
	public void the_user_is_on_the_practice_question_page() {
		App_Hooks.getInstance().getDriver().get(Constants.PRACTICEQUESTIONS);
	}

	@When("the user clicks max consecutive ones")
	public void the_user_clicks_max_consecutive_ones() {
		ArrayPageObjects.getInstance().clickmaxConsecutiveOnes();
	} 

	@When("the user clicks find numbers with even number of digits")
	public void the_user_clicks_find_numbers_with_even_number_of_digits() {
		ArrayPageObjects.getInstance().clickfindNumbers();
	}
	@When("the user clicks squares in sorted array")
	public void the_user_clicks_squares_in_sorted_array() {
		ArrayPageObjects.getInstance().clicksquaresOfSortedArray();
	}
	@When("the user clicks on the submit button without entering any code")
	public void the_user_clicks_on_the_submit_button_without_entering_any_code() {
		ArrayPageObjects.getInstance().clickSubmitBtn();
		
	}

	@Then("the user sees in search the array {string}")
	public void the_user_sees_in_search_array (String expected){
		try {
			Thread.sleep(1000);
			String actual = null;
			actual = ArrayPageObjects.getInstance().getOutput();
			//Assert.assertEquals(actual,expected);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then ("user sees in max consective ones {string}")
	public void user_sees_in_max_consecutive_ones (String expected) {
		try {
			Thread.sleep(1000);
			String actual = null;
			actual = ArrayPageObjects.getInstance().getOutput();
			//Assert.assertEquals(actual,expected);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then ("the user should see in find numbers {string}")
	public void the_user_should_see_in_find_numbers (String expected) {
		try {
			Thread.sleep(1000);
			String actual = null;
			actual = ArrayPageObjects.getInstance().getOutput();
			//Assert.assertEquals(actual,expected);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("the user clicks on the run button without entering any code")
	public void the_user_clicks_on_the_run_button_without_entering_any_code() {
		ArrayPageObjects.getInstance().clickRunBtn();
	}

	@Then("the user should see an alert contains {string}")
	public void the_user_should_see_an_alert_contains(String string) {

		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		Assert.assertEquals(actualErrorMessage, "SyntaxError: bad input on line 2");
		alert.accept();
	}

	@When("the user clicks on the submit button without entering any code in squares of a sorted array")
	public void the_user_clicks_on_the_submit_button_without_entering_any_code_in_squares_of_a_sorted_array()throws InterruptedException {
		ArrayPageObjects.getInstance().clickSubmitBtn();
	}

	@Then("the user should see {string} in sorted array")
	public void the_user_should_see(String expected)  {
		try {
			Thread.sleep(1000);
			String actual = null;
			actual = ArrayPageObjects.getInstance().getOutput();
			//Assert.assertEquals(actual,expected);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
	}


	@When ("the user gives a valid code")
	public void the_user_gives_a_valid_code() {
		JavascriptExecutor js = null;
		try {
			Common_Utils.readExcelFile("Data.xlsx");
		if (App_Hooks.getInstance().getDriver() instanceof JavascriptExecutor) {
		    js = (JavascriptExecutor) App_Hooks.getInstance().getDriver();
		}
		//js.executeScript("document.getElementByClassName('CodeMirror-line').setAttribute('value',"+Common_Utils.questionsList.get(1)+")");
		js.executeScript("return document.getElementsByClassName('CodeMirror-line')[0].remove();");
		ArrayPageObjects.getInstance().enterValidCode(Common_Utils.questionsList.get(1));	
			
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	@And ("the user clicks the run button")
	public void the_user_clicks_the_run_button() {
		
	ArrayPageObjects.getInstance().clickRunBtn();
		
	}
	
	@Then ("the user should see the output in console")
	public void the_user_should_see_the_output_in_console()  {
		String output =	ArrayPageObjects.getInstance().getOutput();
		Assert.assertNotNull(output);
	}
	@Then ("the user clicks the signout button in the arraypage")
	public void the_user_clicks_the_signout_button_in_the_arraypage() {
		App_Hooks.getInstance().getDriver().get(Constants.HOMEPAGE);
		ArrayPageObjects.getInstance().clickSignoutBtn();
	}
}