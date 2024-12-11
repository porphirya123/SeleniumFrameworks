package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/login.feature", glue= {"Loginsteps"})
public class CukeRunner extends  AbstractTestNGCucumberTests{


}
