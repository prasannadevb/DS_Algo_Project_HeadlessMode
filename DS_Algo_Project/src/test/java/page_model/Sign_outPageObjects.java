package page_model;

import org.openqa.selenium.By;

import app_hooks.App_Hooks;
import stepdefinitions.Common_Step_Def;

public class Sign_outPageObjects {
	
	private static Sign_outPageObjects signoutPageObjects;

	private Sign_outPageObjects() {};

	public static Sign_outPageObjects getInstance() {

		if(signoutPageObjects==null) {
			signoutPageObjects= new Sign_outPageObjects();
		}
		return signoutPageObjects;
	}

	By signoutBtn = By.xpath("//a[contains(text(),'Sign out')]");
	By alertMessage = By.xpath("//div[contains(text(),'Logged out successfully')]");
	
	public void clickSignoutBtn () {
		App_Hooks.getInstance().getDriver().findElement(signoutBtn).click();
	}
	
	public String getAlertmessage() {
	return	App_Hooks.getInstance().getDriver().findElement(alertMessage).getText();
	}
	
}
