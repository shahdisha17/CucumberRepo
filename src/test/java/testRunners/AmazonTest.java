package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/java/AppFeatures"},
			glue= {"stepDefinition"},
			monochrome = true,
			plugin = {"pretty"}
			)
	
	public class AmazonTest {
}
