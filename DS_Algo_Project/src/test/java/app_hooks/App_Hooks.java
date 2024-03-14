package app_hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import stepdefinitions.Common_Step_Def;
import utilities.Common_Utils;

public class App_Hooks {

	private static App_Hooks appHooks;
	private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

	public static App_Hooks getInstance() {
		if(appHooks==null) {
			appHooks= new App_Hooks();
		}
		return appHooks;

	}

	public WebDriver getDriver() {
		return drivers.get();
	}

	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver_Manager.getInstance().createDriver(Constants.BROWSER);
		drivers.set(driver);
		System.out.println("This is the scenario name "+scenario.getName().toLowerCase());
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		if(!scenario.getName().toLowerCase().contains("regist")) {
			Common_Step_Def.getInstance().login();
		}
		
	}

	@After
	public void tearDown() {
		getDriver().quit();
		drivers.remove();
	}

	@BeforeAll
	public static void beforeAll() {
		Common_Utils.getInstance().loadProperties();

	}



}
