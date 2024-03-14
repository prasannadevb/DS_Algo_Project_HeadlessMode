package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;
import utilities.Logger_Load;

public class StartpagePageObjects {

	private static StartpagePageObjects startPageObjects;

	private StartpagePageObjects() {};

	public static StartpagePageObjects getInstance() {

		if(startPageObjects==null) {
			startPageObjects= new StartpagePageObjects();
		}
		return startPageObjects;

	}
	By GetStartedBtn   = By.xpath("//button[text()='Get Started']");
	By dsGetStartBtn   = By.xpath("//a[@href='data-structures-introduction']");
	By alertMsg		   = By.xpath("//div[@class='alert alert-primary']");

	public void algo_Startpage()  {
		App_Hooks.getInstance().getDriver().findElement(GetStartedBtn).click();
	}
	public void home_Startpage() {
		App_Hooks.getInstance().getDriver().findElement(dsGetStartBtn).click();
	}
	public String getAlert() {
		return App_Hooks.getInstance().getDriver().findElement(alertMsg).getText();


	}
}