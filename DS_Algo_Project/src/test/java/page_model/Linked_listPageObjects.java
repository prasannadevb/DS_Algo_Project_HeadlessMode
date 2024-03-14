package page_model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import app_hooks.App_Hooks;
import constants.Constants;
import stepdefinitions.Common_Step_Def;
import utilities.Logger_Load;

public class Linked_listPageObjects {
	
	private static Linked_listPageObjects linked_listpageobjects;
	private Linked_listPageObjects() {};
	public static Linked_listPageObjects getInstance(){ 
		if(linked_listpageobjects==null) {
			linked_listpageobjects= new Linked_listPageObjects();	
		}
		return linked_listpageobjects;
	
	}

	By LinkedGetStrtButton = By.xpath("//a[@href='linked-list']");
	By signinLink = By.xpath("//a[text()='Sign in']"); 
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");
	By IntroductionLink = By.xpath("//a[text()='Introduction']");
	
	//By EditorTxt =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By EditorTxt 					  = By.xpath("//textarea[@autocorrect='off']");
	By TryHere = By.xpath("//a[@class='btn btn-info']");

	By Run = By.xpath("//button[text()='Run']");
	By CreatingList = By.xpath("//a[text()='Creating Linked LIst']");
	By TypesLinkedList = By.xpath("//a[text()='Types of Linked List']");
	By ImplementList = By.xpath("//a[text()='Implement Linked List in Python']");
	By Traversal = By.xpath("//a[text()='Traversal']");
	By Insertion =By.xpath("//a[text()='Insertion']");
	By Deletion = By.xpath("//a[text()='Deletion']");
	By PracticeQue = By.xpath("//a[text()='Practice Questions']");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	
	
		
	
	public void login()
	{
	App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
	}
	
	public void login_credentials() {
		App_Hooks.getInstance().getDriver().findElement(usernameTextbox).sendKeys(Constants.USERNAME);
	    App_Hooks.getInstance().getDriver().findElement(passwordTextbox).sendKeys(Constants.PASSWORD);
	    
	}
	
	
	public void login_btn() {
		App_Hooks.getInstance().getDriver().findElement(loginbtn).click();;
	}
	
	public void Linked_GetBtn() {
		App_Hooks.getInstance().getDriver().findElement(LinkedGetStrtButton).click();
	}
	
	public void Introduction_Link() {
		App_Hooks.getInstance().getDriver().findElement(IntroductionLink).click();
	}

	public void TryHereIn() {
		App_Hooks.getInstance().getDriver().findElement(TryHere).click();
	}
		public void TextEditor_Intr() {
			JavascriptExecutor executor= (JavascriptExecutor) App_Hooks.getInstance().getDriver();
			 executor.executeScript("arguments[0].scrollIntoView(true);",App_Hooks.getInstance().getDriver().findElement(EditorTxt) );
			 new Actions(App_Hooks.getInstance().getDriver())
		       .sendKeys(App_Hooks.getInstance().getDriver().findElement(EditorTxt), Constants.PYTHONV)
		       .perform();
			// App_Hooks.getInstance().getDriver().findElement(EditorTxt).sendKeys(Constants.PYTHONV);
			
		}
		public void TextEditor_Intr1() {
			new Actions(App_Hooks.getInstance().getDriver())
		       .sendKeys(App_Hooks.getInstance().getDriver().findElement(EditorTxt), Constants.PYTHONI)
		       .perform();
			//App_Hooks.getInstance().getDriver().findElement(EditorTxt).sendKeys(Constants.PYTHONI);
			
		}
		public void Run_btn() {
			App_Hooks.getInstance().getDriver().findElement(Run).click();
		}
		public void alert_text() {
			App_Hooks.getInstance().getDriver().switchTo().alert().accept();

		}
		public void console_Output() {
			Logger_Load.info("able to see message in console box");
		}
		public void Creating_Linked() {
			App_Hooks.getInstance().getDriver().findElement(CreatingList).click();
		}
		public void Types_Linked() {
			App_Hooks.getInstance().getDriver().findElement(TypesLinkedList).click();
		}
		public void Implement_Linked() {
			App_Hooks.getInstance().getDriver().findElement(ImplementList).click();
		}
		
		public void Traversal_Link() {
			App_Hooks.getInstance().getDriver().findElement(Traversal).click();
		}
		public void Insertion_Link() {
			App_Hooks.getInstance().getDriver().findElement(Insertion).click();
		}
		public void Deletion_Link() {
			App_Hooks.getInstance().getDriver().findElement(Deletion).click();
		}
		public void Practice_Question() {
			App_Hooks.getInstance().getDriver().findElement(PracticeQue).click();
			
		}
		public void SignOut_link() {
			App_Hooks.getInstance().getDriver().findElement(signoutbtn).click();
		}
	}

