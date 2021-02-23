package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order=1)
	public void setup(Scenario sc) {
		System.out.println("launch amazon application");
		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void setup_url() {
		System.out.println("Launch URL");
	}

	@After(order=2)
	public void tearDown() {
		System.out.println("close the browser");
	}
	@After(order=1)
	public void logout() {
		System.out.println("Logout first");
	}
	@BeforeStep
	public void takeScreenshot() {
		System.out.println("Take the screenshot");
	}
	@AfterStep
	public void refresgpage() {
		System.out.println("Refresh my page");
	}
}
