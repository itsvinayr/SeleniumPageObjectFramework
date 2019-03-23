package com.test.selenium.hybridTestFramework.cucumber.steps;

import com.test.selenium.hybridTestFramework.base.CustomFunc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginSteps {
	
	CustomFunc cf = new CustomFunc();
	
	@Given("^user navigates to costco$")
	public void user_navigates_to_costco() throws Throwable {
	    cf.loadAUT();
	}

	@When("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() throws Throwable {
		cf.clickSignIn();
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
		cf.enterUsername();
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
		cf.enterPassword();
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		cf.clickSubmitButton();
	}

}
