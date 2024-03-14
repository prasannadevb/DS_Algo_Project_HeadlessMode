package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class GraphPageObjects {
	
	private static GraphPageObjects graphPageObjects;

	private GraphPageObjects() {};

	public static GraphPageObjects getInstance() {

		if(graphPageObjects==null) {
			graphPageObjects= new GraphPageObjects();
		}
		return graphPageObjects;
}
	
	By signinLink = By.xpath("//a[text()='Sign in']");
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");
	
	
	
	By Getstarted_btn = By.xpath("//a[@href='graph']");
	By Graphlink = By.xpath("//a[@href = 'graph']");
	By try_here = By.xpath("//a[@class='btn btn-info']");
	//By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By textbox 					  = By.xpath("//textarea[@autocorrect='off']");
	By run = By.xpath("//button[text() = 'Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By graphrepresentation = By.xpath("//a[text() = 'Graph Representations']");
	By practice_qp = By.xpath("//a[@class = 'list-group-item list-group-item-light text-info']");
	By empty_pp = By.xpath("//html[@lang = 'en']");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	public  void enterUsername () {
		
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}
	
	public  void enterPassword () {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}
	
	public  void clickLogin() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
	}
	public void graphGetStart() {
		App_Hooks.getInstance().getDriver().findElement(Getstarted_btn).click();
	}
	public void clickGraphLink() {
		App_Hooks.getInstance().getDriver().findElement(Graphlink).click();
	}
	public void clickTryhere() {
		App_Hooks.getInstance().getDriver().findElement(try_here).click();
	}
	public void validCode(String code) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), code)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		App_Hooks.getInstance().getDriver().findElement(run).click();

	}
	public String getOutput() {
		return App_Hooks.getInstance().getDriver().findElement(output).getText();
	}
	public void clickGraphRepresentation() {
		App_Hooks.getInstance().getDriver().findElement(graphrepresentation).click();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), invalidCode)
	       .perform();
		App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(invalidCode);
	}
	public void practiceQuestions() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(practice_qp).click();
	}
	public  void clickSignout() {
		App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
	}

}