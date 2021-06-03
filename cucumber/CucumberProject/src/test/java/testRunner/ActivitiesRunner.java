package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    plugin = {"pretty", "html:target/cucumber-report.html"},
    tags = "@activity1_1"
)

public class ActivitiesRunner {
    //empty
}