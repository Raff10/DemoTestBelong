package autoapp.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                    features = "src/test/java/autoapp/automation/features",
                    glue = {"autoapp/automation/stepDef", "autoapp/automation/utility"},
                    plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
                    tags = {"@demo"}
                )
public class testRunRegister {
}