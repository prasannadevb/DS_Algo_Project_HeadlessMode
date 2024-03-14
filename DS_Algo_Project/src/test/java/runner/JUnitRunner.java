
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		tags = "@arrayhome",
		features = {"src/test/resources/features"},
		plugin = {"pretty", "html:target/result.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue= {"stepdefinitions","page_model"}
		)

//location of step definition files

public class JUnitRunner  {

	

}


