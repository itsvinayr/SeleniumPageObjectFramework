package com.test.selenium.hybridTestFramework.scripts;

import org.testng.annotations.Test;

import com.test.selenium.hybridTestFramework.base.LoadProperties;
import com.test.selenium.hybridTestFramework.base.Path;
import com.test.selenium.hybridTestFramework.commands.ActionDriver;
import com.test.selenium.hybridTestFramework.config.StartBrowser;
import com.test.selenium.hybridTestFramework.pageObjects.HomePage;
import com.test.selenium.hybridTestFramework.pageObjects.LoginPage;
import com.test.selenium.hybridTestFramework.pageObjects.MyAccountPage;

public class TC1 extends StartBrowser{
	
	public static final LoadProperties property = new LoadProperties(Path.getCredentialPath());
	public HomePage homePage = new HomePage();
	public LoginPage loginPage = new LoginPage();
	public MyAccountPage myAccountPage = new MyAccountPage();	
	
	@Test
	public void testSignInSignOut() {
		ActionDriver driver = new ActionDriver();
		driver.launchApplication(property.properties.getProperty("testURL"));
		driver.click(homePage.linkSignIn);
		driver.type(loginPage.txtEmail, property.properties.getProperty("username"));
		driver.type(loginPage.txtPassword, property.properties.getProperty("password"));
		driver.click(loginPage.buttonSignIn);
		driver.mouseHover(myAccountPage.linkMyaccount);
		driver.click(myAccountPage.linkSignOut);
	}

}
