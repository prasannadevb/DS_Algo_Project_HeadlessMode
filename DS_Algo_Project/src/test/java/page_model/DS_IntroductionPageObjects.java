package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;
import stepdefinitions.Common_Step_Def;

public class DS_IntroductionPageObjects {
	
	private static  DS_IntroductionPageObjects ds_introductionpageobject;

	private DS_IntroductionPageObjects() {};

	public static DS_IntroductionPageObjects getInstance() {

		if(ds_introductionpageobject==null) {
			ds_introductionpageobject= new  DS_IntroductionPageObjects();
		}
		return ds_introductionpageobject;

	}

	By Getstarted_btn = By.xpath("//a[@href='data-structures-introduction']");
	By Time_cmp = By.xpath("//a[@href='time-complexity']");
	By try_here = By.xpath("//a[@class='btn btn-info']");
	//By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By textbox 					  = By.xpath("//textarea[@autocorrect='off']");
	By run = By.xpath("//button[text() = \"Run\"]");
	By output 			= By.xpath("//pre[@id='output']");
	By practice_qa = By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
	By empty_pp = By.xpath("//html[@lang = \"en\"]");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	public void clickgetstarted() {
		
		App_Hooks.getInstance().getDriver().findElement(Getstarted_btn).click();
	}
	public void clicktimecompilicity () {
		
		 App_Hooks.getInstance().getDriver().findElement(Time_cmp ).click();
	}
	public void clicktryhere() {
		
		 App_Hooks.getInstance().getDriver().findElement(try_here).click();
	}
	public void validCode(String code)  {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), code)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(code);
	}
	public void runBtn()  {
		App_Hooks.getInstance().getDriver().findElement(run).click();
    }
	
	public String getOutput() {
		return App_Hooks.getInstance().getDriver().findElement(output).getText();
	}
	public void invalidCode(String invalidCode)  {
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), invalidCode)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(invalidCode);
	}
	public void practiceQuestions() throws InterruptedException {

		App_Hooks.getInstance().getDriver().findElement(practice_qa).click();
	}
	public void signOut() {
		App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
	}
}
	
	
	
	
