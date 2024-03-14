package page_model;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class ArrayPageObjects {
	
private static ArrayPageObjects arrayPageObjects;
	
	private ArrayPageObjects() {};
	
	public static ArrayPageObjects getInstance() {
		if(arrayPageObjects==null) {
			arrayPageObjects= new ArrayPageObjects();
		}
		return arrayPageObjects;
		
	}

   
   
	By arraysinpythonBtn    = By.xpath("//a[@href='arrays-in-python']");
	By tryhereBtn           = By.partialLinkText("Try here");
	//By editorbox            = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By editorbox 					  = By.xpath("//textarea[@autocorrect='off']");
	By runBtn               = By.xpath("//button[@type='button']");
	By console              = By.xpath("//pre[@id='output']");
	By arraysusinglist      = By.xpath("//a[contains(text(),'Arrays Using List')]");
	By basic_link           = By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
    By applications_array   = By.xpath("//a[contains(text(),'Applications of Array')]");
	By practice_questions   = By.xpath("//a[contains(text(),'Practice Questions')]");
	By search_the_Array     = By.xpath("//a[contains(text(),'Search the array')]");
	By submitBtn            = By.xpath("//input[@value='Submit']");
	By max_consecutive_Ones = By.xpath("//a[contains(text(),'Max Consecutive Ones')]");
	By find_Numbers         = By.xpath("//a[contains(text(),'Find Numbers with Even Number of Digits')]");
	By squares_sortedArray  = By.xpath("//a[contains(text(),'Squares of  a Sorted Array')]");
	By signoutbtn           = By.xpath("//a[text()='Sign out']");
	
	public void clickArraysinPythonBtn()  {
		
		App_Hooks.getInstance().getDriver().findElement(arraysinpythonBtn).click();
	}
	
   public void clickTryhere()  {
		
		App_Hooks.getInstance().getDriver().findElement(tryhereBtn).click();
	}
   public void enterCode(String code)  {
		
		new Actions(App_Hooks.getInstance().getDriver())
	       .sendKeys(App_Hooks.getInstance().getDriver().findElement(editorbox), code)
	       .perform();
		//App_Hooks.getInstance().getDriver().findElement(editorbox).sendKeys(code);
		
	}
   public void clickRunBtn()  {
		
		App_Hooks.getInstance().getDriver().findElement(runBtn).click();
		
	}
   public void enterValidCode(String validCode) {
	   new Actions(App_Hooks.getInstance().getDriver())
       .sendKeys(App_Hooks.getInstance().getDriver().findElement(editorbox), validCode)
       .perform();
	    //App_Hooks.getInstance().getDriver().findElement(editorbox).sendKeys(validCode);
		
	}
   
   public String getOutput()  {
		
	    return App_Hooks.getInstance().getDriver().findElement(console).getText().trim();
	}
   public void clickArraysUsingList()  {
		
		App_Hooks.getInstance().getDriver().findElement(arraysusinglist).click();
	}
   public void clickBasicOperationsinLists()  {
		
		App_Hooks.getInstance().getDriver().findElement(basic_link).click();
	}
   public void clickApplicationsOfArray()  {
		
		App_Hooks.getInstance().getDriver().findElement(applications_array).click();
	}
   public void clickPracticeQuestions()  {
		
		App_Hooks.getInstance().getDriver().findElement(practice_questions).click();
	}
   public void clicksearchTheArray()  {
		
		App_Hooks.getInstance().getDriver().findElement(search_the_Array).click();
	}
   public void clickmaxConsecutiveOnes()  {
		
		App_Hooks.getInstance().getDriver().findElement(max_consecutive_Ones).click();
	}
   public void clickfindNumbers()  {
		
		App_Hooks.getInstance().getDriver().findElement(find_Numbers).click();
	}
   public void clicksquaresOfSortedArray()  {
		
		App_Hooks.getInstance().getDriver().findElement(squares_sortedArray).click();
	}
   public void clickSubmitBtn()  {
		
		App_Hooks.getInstance().getDriver().findElement(submitBtn).click();
	}
  
   public void clickSignoutBtn() {
	   
	 App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
   }
   
}

