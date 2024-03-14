package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class StackPageObjects {

	private static StackPageObjects stackPageObjects;

	private StackPageObjects() {};

	public static StackPageObjects getInstance() {

		if(stackPageObjects==null) {
			stackPageObjects= new StackPageObjects();
		}
		return stackPageObjects;

	}

	By usernameTextbox 	= By.xpath("//input[@name='username']");
	By passwordTextbox 	= By.xpath("//input[@name='password']");
	By loginbtn 		= By.xpath("//input[@value='Login']");

	By stackGetstarted 	= By.xpath("//a[@href='stack']");
	By operationsLink  	= By.xpath("//a[@href='operations-in-stack']");
	By implementLink  	= By.xpath("//a[@href='implementation']");
	By applicationsLink = By.xpath("//a[@href='stack-applications']");
	By practiceLink 	= By.xpath("//a[text()='Practice Questions']");
	By tryherelink 		= By.xpath("//a[@href='/tryEditor']");
	//By textbox 			= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By textbox 					  = By.xpath("//textarea[@autocorrect='off']");
	By runbtn 			= By.xpath("//button[text()='Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By signoutbtn 		= By.xpath("//a[text()='Sign out']");

	public  void enterUsername () {
		
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}
	
	public  void enterPassword () {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}
	
	public  void clickLogin() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
	}
	
	public void stackGetStart() {
		App_Hooks.getInstance().getDriver().findElement(stackGetstarted).click();
	}
	public void clickstackOperations() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(operationsLink).click();
	}
	
	public void clickstackImplementation() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(implementLink).click();
	}
	
	public void clickstackapplication() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(applicationsLink).click();
	}
	public void tryhere() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(tryherelink).click();
	}
	public void practiceQuestions() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(practiceLink).click();
	}
	public void validCode(String code) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), code)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		App_Hooks.getInstance().getDriver().findElement(runbtn).click();

	}
	public String getOutput() {
		return App_Hooks.getInstance().getDriver().findElement(output).getText();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), invalidCode)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(invalidCode);
	}
	public void signOut() {
		App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
	}
}