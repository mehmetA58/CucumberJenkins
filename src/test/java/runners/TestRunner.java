package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-html-report"},
        glue= {"StepDefinitionsNew.java"},
        features= {"features"},
        dryRun=false,
        tags="@smoke"
        )
public class TestRunner {

}
