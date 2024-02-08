package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on NetBanking page")
	public void user_is_on_net_banking_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking page");
	}
	
	
	@When("^User login  with (.+) and password (.+) application$")
	public void user_login_with_and_password_application(String UserName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User login  with "+UserName+" and "+Password);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}

}
