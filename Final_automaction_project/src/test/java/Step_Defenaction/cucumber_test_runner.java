package Step_Defenaction;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = " ", features = {"src/test/resources/Features"}, 
glue = {"Step_Defenaction"}, 
plugin = {"pretty","html:target/full.html"} )

public class cucumber_test_runner extends  AbstractTestNGCucumberTests {
	
		

}

