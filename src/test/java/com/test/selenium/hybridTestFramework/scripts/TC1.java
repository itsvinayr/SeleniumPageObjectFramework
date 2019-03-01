package com.test.selenium.hybridTestFramework.scripts;

import org.testng.annotations.Test;

import com.test.selenium.hybridTestFramework.base.LoadTestProperties;
import com.test.selenium.hybridTestFramework.commands.ActionDriver;
import com.test.selenium.hybridTestFramework.config.StartBrowser;
import com.test.selenium.hybridTestFramework.pageObjects.HomePage;
import com.test.selenium.hybridTestFramework.pageObjects.LoginPage;
import com.test.selenium.hybridTestFramework.pageObjects.MyAccountPage;

public class TC1 extends StartBrowser{
	
	public String URL = "https://www.costco.com/";
	public HomePage homePage = new HomePage();
	public LoginPage loginPage = new LoginPage();
	public MyAccountPage myAccountPage = new MyAccountPage();
	public static final String FILE_NAME = "credentials.properties";
	public static final LoadTestProperties property = new LoadTestProperties(FILE_NAME);
	
	
	@Test
	public void testSignInSignOut() {
		ActionDriver driver = new ActionDriver();
		driver.launchApplication(URL);
		driver.click(homePage.linkSignIn);
		driver.type(loginPage.txtEmail, property.properties.getProperty("username"));
		driver.type(loginPage.txtPassword, property.properties.getProperty("password"));
		driver.click(loginPage.buttonSignIn);
		driver.mouseHover(myAccountPage.linkMyaccount);
		driver.click(myAccountPage.linkSignOut);
	}

}
