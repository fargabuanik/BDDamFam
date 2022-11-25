package steps;

import base.BaseClass; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;

public class AutoSteps extends BaseClass {
	@Given("user navigate to homePage")
	public void user_navigate_to_home_page() {
	   Logs.log("Before Hook");
	}

	@When("user click start new quote")
	public void user_click_start_new_quote() {
		homePage.clickStartNewQuote();
	
	}

	@When("user input zipcode")
	public void user_input_zipcode() {
		 getAQuote.zipCode("85142"); 
	   
	}

	@When("user click car insurance option")
	public void user_click_car_insurance_option() {
		getAQuote.clickCar();
	    
	}

	@When("user click lets go button")
	public void user_click_lets_go_button() {
		getAQuote.ClickletsGo();
	   
	}

	@When("select city and state")
	public void select_city_and_state() {
		verifyYourcity.clickcheckBox();
	   
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	   verifyYourcity.continuButton();
	}

	@Then("title of the page will be <auto quote page>")
	public void title_of_the_page_will_be_auto_quote_page() {
		Logs.log(getDriver().getTitle()); 
	
	}

	@When("user input address")
	public void user_input_address() {
		aboutYou.address("S 199th st, Queen Creek"); 
		 
	}

	@Then("user able to click start new quote button")
	public void user_able_to_click_start_new_quote_button() {
		aboutYou.startNewQuote();
	    
	}


}
