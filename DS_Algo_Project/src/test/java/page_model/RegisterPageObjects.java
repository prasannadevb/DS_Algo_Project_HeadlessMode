package page_model;

import org.openqa.selenium.By;
import app_hooks.App_Hooks;
import stepdefinitions.Common_Step_Def;

public class RegisterPageObjects {

	private static RegisterPageObjects registerPageObjects;

	private RegisterPageObjects() {};

	public static RegisterPageObjects getInstance() {

		if(registerPageObjects==null) {
			registerPageObjects= new RegisterPageObjects();
		}
		return registerPageObjects;

	}

	By registerLink = By.xpath("//a[text()=' Register ']");
	By regsitrationBtn = By.xpath("//input[@value='Register']");
	By usernameTxtbox  = By.xpath("//input[@name='username']");
By passwordTxtbox  = By.xpath("//input[@name='password1']");
	By passwordConfirmbox = By.xpath("//input[@name='password2']");
	By errorMsg = By.xpath("//div[@class='alert alert-primary']");
	
	public void clickRegisterLink() {
		App_Hooks.getInstance().getDriver().findElement(registerLink).click();
	}
	
	public  void enterUsername (String username) {
		App_Hooks.getInstance().getDriver().findElement(usernameTxtbox).sendKeys(username);
		
	}
	public  void enterPassword (String password) {
		App_Hooks.getInstance().getDriver().findElement(passwordTxtbox).sendKeys(password);
		
	}
	public  void clickRegister() {
		App_Hooks.getInstance().getDriver().findElement(regsitrationBtn).click();
		
	}
	public void clearUsername() {
		App_Hooks.getInstance().getDriver().findElement(usernameTxtbox).clear();
	}
	public void clearPassword() {
		App_Hooks.getInstance().getDriver().findElement(passwordTxtbox).clear();
	}
	public void invalidUsername() {
		App_Hooks.getInstance().getDriver().findElement(usernameTxtbox).sendKeys("@+= ");
	}
	public void invalidPassword() {
		App_Hooks.getInstance().getDriver().findElement(passwordTxtbox).sendKeys("123");
	}
	public void invalidPassword1() {
		App_Hooks.getInstance().getDriver().findElement(passwordTxtbox).sendKeys("numpy");
	}
	public void enterinvalidconfirmation() {
		App_Hooks.getInstance().getDriver().findElement(passwordConfirmbox).sendKeys("numpy90");
		
	}
	public void enterconfirmation(String password) {
		App_Hooks.getInstance().getDriver().findElement(passwordConfirmbox).sendKeys(password);
		
	}
	public void clearconfirmation() {
		App_Hooks.getInstance().getDriver().findElement(passwordConfirmbox).clear();
		
	}
	

	public String getAlert() {
		return App_Hooks.getInstance().getDriver().findElement(errorMsg).getText();

	}
	}
