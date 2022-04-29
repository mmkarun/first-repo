package stepupdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepUpDefinition {
	
	
	@Given("user is facebook page")
	public void user_is_facebook_page() {
	  System.out.println("user on facebook page");
	}

	@When("user enter userName and password")
	public void user_enter_userName_and_password() {
	  
		System.out.println("user enter usernam and password ");
	}

	@And("user click login button")
	public void user_click_login_button() {
		
	  System.out.println("clicked login ");
	}

	@Then("user should verify homePage")
	public void user_should_verify_homePage() {
	   
		System.out.println("home page is verified");
	}




}
