package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	//Change from the clone version...

	@Given("^User is on Net Banking Landing page$")
	public void user_is_on_net_banking_landing_page() throws Throwable {
		System.out.println("User is on Net Banking Landing page");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("User login into application with username and password");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Cards are displayed");
	}

	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_something_and_password_something(String strArg1,
			String strArg2) throws Throwable {
		System.out.println("User login into application with username 'John' and password '1234' ");
		System.out.println("strArg1: " + strArg1);
		System.out.println("strArg2: " + strArg2);
	}

	@Given("User is on Net Banking Landing page")
	public void user_is_on_Net_Banking_Landing_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}