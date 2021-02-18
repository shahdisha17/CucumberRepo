package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Order.feature"},
		glue = {"stepDefinition"},
		monochrome = true,
		tags = "@Smoke",
		plugin = {"pretty"}
		
		)
public class OrderTest {

}
