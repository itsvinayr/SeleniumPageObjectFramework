package com.test.selenium.hybridTestFramework.scripts;

import org.testng.annotations.Test;

import com.test.selenium.hybridTestFramework.commands.ActionDriver;
import com.test.selenium.hybridTestFramework.config.StartBrowser;
import com.test.selenium.hybridTestFramework.pageObjects.HomePage;
import com.test.selenium.hybridTestFramework.pageObjects.LoginPage;
import com.test.selenium.hybridTestFramework.pageObjects.MyAccountPage;

public class TC1 extends StartBrowser{
	
	public static String URL = "https://www.costco.com/";
	
	@Test
	public void testSignInSignOut() {
		ActionDriver driver = new ActionDriver();
		driver.launchApplication(URL);
		driver.click(HomePage.linkSignIn);
		driver.type(LoginPage.txtEmail, "vinay.raghu10@gmail.com");
		driver.type(LoginPage.txtPassword, "Testing@0210");
		driver.click(LoginPage.buttonSignIn);
		driver.mouseHover(MyAccountPage.linkMyaccount);
		driver.click(MyAccountPage.linkSignOut);
	}

}
