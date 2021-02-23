package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/AppFeatures/Search.feature"},
			glue= {"stepDefinition","myHooks"},
			monochrome = true,
			tags = "@All",
			plugin = {"pretty","json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"}
			)
	
	public class AmazonTest {
}
