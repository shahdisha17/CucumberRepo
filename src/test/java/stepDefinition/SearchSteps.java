package stepDefinition;

import amazonImplement.Product;
import amazonImplement.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("Search filed on Amazon page")
	public void search_filed_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1:I am on search page");
	    
	}

	@When("I search for product name {string} and price {int}")
	public void i_search_for_product_name_and_price(String productName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Step 2:Search the product with name " +productName+ "price" +price);
	  
	  product=new Product(productName, price);
	}

	@Then("Product will name {string} should be displayed")
	public void product_will_name_should_be_displayed(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Product " +productName+ " displayed");
	    
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println("Search product name is : " +name);
		
	}

}
