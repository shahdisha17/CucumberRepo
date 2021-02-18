package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	
	@Given("User wants to select a car {string} from the uber app")
	public void user_wants_to_select_a_car_from_the_uber_app(String carType) {
	    System.out.println("Step 1: " +carType);
	}

	@When("User selects car {string} and pickup point {string} and drop location {string}")
	public void user_selects_car_and_pickup_point_and_drop_location(String carType, String pickUpLocation, String DropLocation) {
		System.out.println("Step 2: " +carType + " " +pickUpLocation+ " " +DropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3:");
	}

	@Then("Drivers end the journey")
	public void drivers_end_the_journey() {
		System.out.println("Step 4:");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5: " +price);
	}
}
