package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("The Page is Loaded")
	public void the_page_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Page Load");
	}
	
	@When("I Enter The {string} and {string}")
	public void i_enter_the_and(String uname, String passwd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(uname);
	    System.out.println(passwd);
	}
	


}
