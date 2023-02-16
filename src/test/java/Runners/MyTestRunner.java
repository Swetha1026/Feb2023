package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Login.feature",
                 glue={"StepDefinitions","Hooks"},
                 dryRun = false
                  )
public class MyTestRunner {
}
