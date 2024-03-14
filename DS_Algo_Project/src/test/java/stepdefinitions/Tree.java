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
import page_model.TreePageObjects;
import utilities.ExcelReader;

public class Tree {
	
	@Given("user is on the sign in page")
	public void the_user_is_on_the_sign_in_page() {
	    
		App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	}
	@When("user enters login credentials")
	public void user_enters_login_credentials() {
	   
		TreePageObjects.getInstance().enterUsername();
		TreePageObjects.getInstance().enterPassword();
		TreePageObjects.getInstance().clickLogin();
		}
	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		
		
	   
	}

	
	
	
	@Given("user is on tree page")
	public void user_is_on_tree_page() throws InterruptedException {
	    App_Hooks.getInstance().getDriver().get(Constants.TREEPAGE);
	    
	}

	@When("user clicks overview of tree in tree page")
	public void user_clicks_overview_of_tree_in_tree_page() {
	   TreePageObjects.getInstance().clickOverview();
	}

	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String title) {
		String actualtitle =  App_Hooks.getInstance().getDriver().getTitle();
		Assert.assertEquals(actualtitle,title);
	}

	@When("user clicks the try here button")
	public void user_clicks_the_try_here_button() {
	   TreePageObjects.getInstance().tryHere();
	}

	@Then("user should be redirected to page having editor and run button")
	public void user_should_be_redirected_to_page_having_editor_and_run_button() {
	    
	}

	@When("user writes valid python code with {string} and rownumber {int} in tree page editor")
	public void user_writes_valid_python_code_with_and_rownumber_in_tree_page_editor(String sheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		TreePageObjects.getInstance().validCode(text);
		}


	
	@When("user clicks the run button")
	public void user_clicks_the_run_button() {
	   TreePageObjects.getInstance().clickRun();
	}

	@Then("user is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		 String output=TreePageObjects.getInstance().getOutput();
		 System.out.println(output);
	}

	@When("user clicks terminologies in tree page")
	public void user_clicks_terminologies_in_tree_page() {
	    TreePageObjects.getInstance().clickterminologies();
	}

	@When("user writes invalid python code with {string} and rownumber {int} in tree page editor")
	public void user_writes_invalid_python_code_with_and_rownumber_in_tree_page_editor(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		Thread.sleep(1000);
		ExcelReader reader = new ExcelReader();
		String excelPath = System.getProperty("user.dir") + "\\src\\test\\java\\utilities\\pythonexceldata.xlsx";
		System.out.println(excelPath);
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetName);
		String text = testdata.get(rowNumber).get("Input");
		TreePageObjects.getInstance().invalidCode(text);
	}
	@Then("user see error msg in alert window")
	public void user_see_error_msg_in_alert_window() {
		Alert alert = App_Hooks.getInstance().getDriver().switchTo().alert();
		String actualErrorMessage = alert.getText();
		System.out.println(actualErrorMessage);
		Assert.assertEquals(actualErrorMessage, "NameError: name 'hello' is not defined on line 1");
		alert.accept();
	}

	@When("user clicks types of trees in tree page")
	public void user_clicks_types_of_trees_in_tree_page() {
	    TreePageObjects.getInstance().typeoftrees();
	}

	@When("user clicks run button without entering the code")
	public void user_clicks_run_button_without_entering_the_code() {
	   TreePageObjects.getInstance().clickRun();
	}

	@Then("nothing happens to the page and no error msg is dispalyed")
	public void nothing_happens_to_the_page_and_no_error_msg_is_dispalyed() {
	    System.out.println("No error message");
	}

	@When("user clicks tree traversals in tree page")
	public void user_clicks_tree_traversals_in_tree_page() {
	    TreePageObjects.getInstance().clicktreetraversals();
	}

	@When("user clicks tree traversals-illustration in tree page")
	public void user_clicks_tree_traversals_illustration_in_tree_page() {
	    TreePageObjects.getInstance().traversalsillustration();
	}

	@When("user clicks Binary trees in tree page")
	public void user_clicks_binary_trees_in_tree_page() {
	    TreePageObjects.getInstance().binarytrees();
	}

	@When("user clicks types of binary trees in tree page")
	public void user_clicks_types_of_binary_trees_in_tree_page() {
	    TreePageObjects.getInstance().typesofBinarytrees();
	}

	@When("user clicks Implementation in python in tree page")
	public void user_clicks_implementation_in_python_in_tree_page() {
	    TreePageObjects.getInstance().implementationinpython();
	}

	@When("user clicks binary tree traversals in tree page")
	public void user_clicks_binary_tree_traversals_in_tree_page() {
	TreePageObjects.getInstance().binarytreetraversals();
	}

	@When("user clicks Implementation of Binary Trees in tree page")
	public void user_clicks_implementation_of_binary_trees_in_tree_page() {
	    TreePageObjects.getInstance().implementationofBinaryTrees();
	}

	@When("user clicks Applications of Binary trees in tree page")
	public void user_clicks_applications_of_binary_trees_in_tree_page() {
	   TreePageObjects.getInstance().applicationsofBinaryTrees();
	}

	@When("user clicks Binary search Trees in tree page")
	public void user_clicks_binary_search_trees_in_tree_page() {
	   TreePageObjects.getInstance().binarysearchtrees();
	}

	@When("user clicks Implementation of BST in tree page")
	public void user_clicks_implementation_of_bst_in_tree_page() {
	    TreePageObjects.getInstance().implementationofBst();
	}

	@When("user clicks Practice Questions link")
	public void user_clicks_practice_questions_link() {
	    TreePageObjects.getInstance().practiceques();
	}

	@Then("user should be redirected to Practice Questions page")
	public void user_should_be_redirected_to_practice_questions_page() {
	    
	}

	@Then("user clicks on sign out page")
	public void user_clicks_on_sign_out_page() {
		TreePageObjects.getInstance().signOut();
	}



		
	

}