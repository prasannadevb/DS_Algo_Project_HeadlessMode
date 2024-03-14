package page_model;

import org.openqa.selenium.By;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class LoginPageObjects {

	private static LoginPageObjects loginPageObjects;

	private LoginPageObjects() {};

	public static LoginPageObjects getInstance() {

		if(loginPageObjects==null) {
			loginPageObjects= new LoginPageObjects();
		}
		return loginPageObjects;

	}
	
    By signinLink 		= By.xpath("//a[text()='Sign in']"); 
	
    By loginbtn         = By.xpath("//input[@value='Login']");
	By usernameTextbox  = By.xpath("//input[@name='username']");
	By passwordTextbox  = By.xpath("//input[@name='password']");
	
	By errorMsg 		= By.xpath("//div[@class='alert alert-primary']");
	By signoutbtn 		= By.xpath("//a[text()='Sign out']");
	
	
	public void clickSignin() {
		App_Hooks.getInstance().getDriver().findElement(signinLink).click();
	}
	
	public  void enterUsername () {
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);
		
	}
	public  void enterPassword () {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);
		
	}
	public  void clickLogin() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
		
	}
	public void clearUsername() {
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).clear();
	}
	public void clearPassword() {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).clear();
	}
	public void invalidUsername() {
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys("hello");
	}
	public void invalidPassword() {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys("hi123");
	}
	public String getAlert() {
		return App_Hooks.getInstance().getDriver().findElement(errorMsg).getText();


	}
	
}