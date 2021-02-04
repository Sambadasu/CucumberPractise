package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/Features",glue= {"StepDefinitions"},
		monochrome = true,
		plugin = {"pretty","junit:target/Reports/SampleXml.xml"},
		//plugin = {"pretty","json:target/Reports/Sample.json"}
		tags="@SmokeTest"
)
public class TestRunner 
{

}
