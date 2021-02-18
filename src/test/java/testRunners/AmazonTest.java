package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/AppFeatures/Uber.feature"},
			glue= {"stepDefinition"},
			monochrome = true,
			tags = "@Regression and @Smoke",
			plugin = {"pretty"}
			)
	
	public class AmazonTest {
}
