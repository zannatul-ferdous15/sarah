package softwareTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import softwareTestUtility.Base_softwareTest;
@CucumberOptions(features= {"src/test/resourcess/softwareTestAllFeature"}, plugin= {"json:target/cucumber.json"}, 
glue="softwareTestStepdefination")// tags= {"@home"})

public class Testrunner_softwareTest extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void StartURL() {
		Base_softwareTest Start= new Base_softwareTest();
		Start.softwareTest_Browser_Setup();
	}
	@AfterTest
	public void CloseBrowser() {
		Base_softwareTest Start= new Base_softwareTest();
		
		Start.driver.quit();
	}

}
	
	