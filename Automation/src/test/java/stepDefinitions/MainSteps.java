package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Practice landing page");	
	}
	
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println(username);
//	    System.out.println(password);
//	}
	
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> Data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
		System.out.println(Data.get(0));
		System.out.println(Data.get(1));
		System.out.println(Data.get(2));
		System.out.println(Data.get(3));
	}

	
	
	
	

	@When("^User login into application with (.+) and password (.+)$")                // ^ at start and $ at end is regex
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(username);
	    System.out.println(password);
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
		System.out.println("*********************************************");
		
	}
	
	
	
	


}
