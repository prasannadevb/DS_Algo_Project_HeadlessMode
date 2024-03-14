package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class QueuePageObjects {

	private static QueuePageObjects queuePageObjects;

	private QueuePageObjects() {};

	public static QueuePageObjects getInstance() {

		if(queuePageObjects==null) {
			queuePageObjects= new QueuePageObjects();
		}
		return queuePageObjects;
	}

	By signinLink = By.xpath("//a[text()='Sign in']");
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");

	By getstarted_btn = By.xpath("//a[@href='queue']"); 
	By click_implementation = By.xpath("//a[text() = 'Implementation of Queue in Python']");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	//By text_box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By text_box 					 = By.xpath("//textarea[@autocorrect='off']");
	By Run = By.xpath("//button[text() = 'Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By implementationcollection = By.xpath("//a[text() = 'Implementation using collections.deque']");
	By array= By.xpath("//a[text() = 'Implementation using array']");
	By Queue_operation= By.xpath("//a[text() = 'Queue Operations']");
	By practice_qa=By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
	By empty_pp = By.xpath("//html[@lang = \"en\"]");
	By signoutbtn =By.xpath("//a[text()='Sign out']");


	public  void enterUsername () {

		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}

	public  void enterPassword () {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}

	public  void clickLogin() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
	}
	public void queueGetStart() {
		App_Hooks.getInstance().getDriver().findElement(getstarted_btn).click();
	}
	public void clickImplementationLink() {
		App_Hooks.getInstance().getDriver().findElement(click_implementation).click();
	}
	public void clickTryhere() {
		App_Hooks.getInstance().getDriver().findElement(tryhere).click();
	}
	public void validCode(String code) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(text_box), code)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(text_box).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		App_Hooks.getInstance().getDriver().findElement(Run).click();

	}
	public String getOutput() {
		return App_Hooks.getInstance().getDriver().findElement(output).getText();
	}
	public void clickCollection() {
		App_Hooks.getInstance().getDriver().findElement(implementationcollection).click();
	}
	public void clickArray() {
		App_Hooks.getInstance().getDriver().findElement(array).click();
	}
	public void clickOperation() {
		App_Hooks.getInstance().getDriver().findElement(Queue_operation).click();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(text_box), invalidCode)
	       .perform();
		App_Hooks.getInstance().getDriver().findElement(text_box).sendKeys(invalidCode);
	}
	public void practiceQuestions() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(practice_qa).click();
	}
	public  void clickSignout() {
		App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
	}

}