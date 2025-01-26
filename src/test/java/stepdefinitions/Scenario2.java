package stepdefinitions;

import io.cucumber.java.en.*;
public class Scenario2 {
	@Given("I have search box")
	public void i_have_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("i enter {string} in the search bar")
	public void i_enter_in_the_search_bar(String phone) {
	    // Write code here that turns the phrase above into concrete actions
	
	    System.out.println(phone);
	
	}
	

	@Then("it list the samsung phones")
	public void it_list_the_samsung_phones() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
