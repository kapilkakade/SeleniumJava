package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
																							// after true, we can give tags
@CucumberOptions(features="src/test/java/features", glue="stepDefinitions" , monochrome=true)//tags="@SmokeTest and @RegressionTest"
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	
 
}
