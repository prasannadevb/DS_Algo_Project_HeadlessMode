package page_model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class TreePageObjects {
	
	private static TreePageObjects treePageObjects;

	private TreePageObjects() {};

	public static TreePageObjects getInstance() {

		if(treePageObjects==null) {
			treePageObjects= new TreePageObjects();

		}
		return treePageObjects;

}
	By usernameTextbox 	= By.xpath("//input[@name='username']");
	By passwordTextbox 	= By.xpath("//input[@name='password']");
	By loginbtn 		= By.xpath("//input[@value='Login']");
	
	
	
	String TreepgURL 			  = "https://dsportalapp.herokuapp.com/tree/";
	By overviewoftreelink 		  = By.xpath("//a[@href='overview-of-trees']");
	By terminologieslink 		  = By.xpath("//a[@href='terminologies']");
	By typesoftreeslink 		  = By.xpath("//a[@href='types-of-trees']");
	By treetraversalslink 		  = By.xpath("//a[@href='tree-traversals']");
	By traversalsillustrationlink = By.xpath("//a[@href='traversals-illustration']");
	By binarytreeslink 			  = By.xpath("//a[@href='binary-trees']");
	By typesofBinarytreeslink 	  = By.xpath("//a[@href='types-of-binary-trees']");
	By implementationinpythonlink = By.xpath("//a[@href='implementation-in-python']");
	By binarytreetraversalslink   = By.xpath("//a[@href='binary-tree-traversals']");
	By implementationofBinaryTreeslink =By.xpath("//a[@href='implementation-of-binary-trees']");
	By applicationsofBinaryTreeslink =By.xpath("//a[@href='applications-of-binary-trees']");
	By binarysearchtreeslink      = By.xpath("//a[@href='binary-search-trees']");
	By implementationofBstlink    = By.xpath("//a[@href='implementation-of-bst']");
	By practicequeslink           = By.xpath("//a[@href='/tree/practice']");
	By tryherelink                = By.xpath("//a[@href='/tryEditor']");
	//By textbox 					  = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By textbox 					  = By.xpath("//textarea[@autocorrect='off']");
	
	By runbtn                     = By.xpath("//button[text()='Run']");
	By output                     = By.xpath("//pre[@id='output']");
	By signoutbtn                 = By.xpath("//a[text()='Sign out']");
	
	
public  void enterUsername () {
		
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}
	
	public  void enterPassword () {
		App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}
	
	public  void clickLogin() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();
	}
	
	
	public void  clickOverview() {
		App_Hooks.getInstance().getDriver().findElement(overviewoftreelink).click();
	}
	public void clickterminologies() {
		App_Hooks.getInstance().getDriver().findElement(terminologieslink).click();
	}
	public void typeoftrees() {
		App_Hooks.getInstance().getDriver().findElement(typesoftreeslink).click();
	}
	public void traversalsillustration() {
		App_Hooks.getInstance().getDriver().findElement(traversalsillustrationlink).click();
	}
	public void clicktreetraversals() {
		App_Hooks.getInstance().getDriver().findElement(treetraversalslink).click();;
	}
	public void binarytrees() {
		App_Hooks.getInstance().getDriver().findElement(binarytreeslink).click();
		
	}
	public void typesofBinarytrees() {
		App_Hooks.getInstance().getDriver().findElement(typesofBinarytreeslink).click();
	}
	public void implementationinpython() {
		App_Hooks.getInstance().getDriver().findElement(implementationinpythonlink).click();
		}
	public void binarytreetraversals() {
		App_Hooks.getInstance().getDriver().findElement(binarytreetraversalslink).click();
	}
	public void implementationofBinaryTrees() {
		App_Hooks.getInstance().getDriver().findElement(implementationofBinaryTreeslink).click();
	}
	public void applicationsofBinaryTrees() {
		App_Hooks.getInstance().getDriver().findElement(applicationsofBinaryTreeslink).click();
		
	}
	public void binarysearchtrees() {
		App_Hooks.getInstance().getDriver().findElement(binarysearchtreeslink).click();
		}
	public void implementationofBst() {
		App_Hooks.getInstance().getDriver().findElement(implementationofBstlink).click();
	}
	public void practiceques() {
		App_Hooks.getInstance().getDriver().findElement(practicequeslink).click();
	}
	public void tryHere() {
		App_Hooks.getInstance().getDriver().findElement(tryherelink).click();
	}
	public void clickRun() {
		App_Hooks.getInstance().getDriver().findElement(runbtn).click();
	}
	public void validCode(String code) throws InterruptedException {
		JavascriptExecutor executor= (JavascriptExecutor) App_Hooks.getInstance().getDriver();
		 executor.executeScript("arguments[0].scrollIntoView(true);",App_Hooks.getInstance().getDriver().findElement(textbox) );
		 new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), code)
	       .perform();
		// App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(code);
	}
	public String getOutput() {
		return App_Hooks.getInstance().getDriver().findElement(output).getText();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {
		JavascriptExecutor executor= (JavascriptExecutor) App_Hooks.getInstance().getDriver();
		 executor.executeScript("arguments[0].scrollIntoView(true);",App_Hooks.getInstance().getDriver().findElement(textbox) );
		 new Actions(App_Hooks.getInstance().getDriver())
         .sendKeys(App_Hooks.getInstance().getDriver().findElement(textbox), invalidCode)
         .perform();
		// App_Hooks.getInstance().getDriver().findElement(textbox).sendKeys(invalidCode);
	}
	public void signOut() {
		App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
	}
	}