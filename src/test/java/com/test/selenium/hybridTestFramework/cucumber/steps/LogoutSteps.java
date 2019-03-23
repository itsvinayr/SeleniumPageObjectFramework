package com.test.selenium.hybridTestFramework.cucumber.steps;

import com.test.selenium.hybridTestFramework.base.CustomFunc;
import cucumber.api.java.en.Then;

public class LogoutSteps {
	
	CustomFunc cf = new CustomFunc();

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
		cf.mouseHoverLinkMyAccount();
		cf.logOut();
		cf.quitBrowser();
	}

}
