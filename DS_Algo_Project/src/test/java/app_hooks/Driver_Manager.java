package app_hooks;


import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;

import constants.Constants;



public class Driver_Manager {
	private static final Logger LOGGER= LogManager.getLogger(Driver_Manager.class);
	private static Driver_Manager driverManager;

	private static final ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
	private Driver_Manager() {};

	public static Driver_Manager getInstance() {
		if(driverManager==null) {
			driverManager= new Driver_Manager();
		}
		return driverManager;

	}

	public  WebDriver createDriver(String browser) {
		// TODO Auto-generated method stub

		try {

			switch (browser) {
			case "chrome":

				LOGGER.info("Launching "+ Constants.BROWSER);
				return new ChromeDriver();

			case "firefox":

				LOGGER.info("Launching "+ Constants.BROWSER);
				return  new FirefoxDriver();

			case "ie":

				LOGGER.info("Launching "+ Constants.BROWSER);
				return new InternetExplorerDriver();

			case "edge":

				LOGGER.info("Launching "+ Constants.BROWSER);
				return new EdgeDriver();

			default:

				LOGGER.info("Launching "+ Constants.BROWSER);
				return new ChromeDriver();

			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ChromeDriver();

	}



	
}
