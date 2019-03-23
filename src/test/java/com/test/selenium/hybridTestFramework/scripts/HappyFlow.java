package com.test.selenium.hybridTestFramework.scripts;

import org.testng.annotations.Test;

import com.test.selenium.hybridTestFramework.base.CustomFunc;

public class HappyFlow {
	
	CustomFunc cf = new CustomFunc();
	
	@Test
	public void testHappyFlow() {
		cf.loadAUT();
		cf.clickSignIn();
		cf.enterUsername();
		cf.enterPassword();
		cf.clickSubmitButton();
		cf.mouseHoverLinkMyAccount();
		cf.logOut();
		cf.quitBrowser();
	}

}
