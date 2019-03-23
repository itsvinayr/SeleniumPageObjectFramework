package com.test.selenium.hybridTestFramework.base;

import com.test.selenium.hybridTestFramework.base.LoadProperties;
import com.test.selenium.hybridTestFramework.base.Path;
import com.test.selenium.hybridTestFramework.commands.ActionDriver;
import com.test.selenium.hybridTestFramework.config.StartBrowser;
import com.test.selenium.hybridTestFramework.pageObjects.HomePage;
import com.test.selenium.hybridTestFramework.pageObjects.LoginPage;
import com.test.selenium.hybridTestFramework.pageObjects.MyAccountPage;

public class CustomFunc extends StartBrowser{
	
	public static final LoadProperties property = new LoadProperties(Path.getCredentialPath());
	public HomePage homePage = new HomePage();
	public LoginPage loginPage = new LoginPage();
	public MyAccountPage myAccountPage = new MyAccountPage();
	public ActionDriver driver = new ActionDriver();
	
	public void loadAUT() {
		driver.launchApplication(property.properties.getProperty("testURL"));
	}
	
	public void clickSignIn() {
		driver.click(homePage.linkSignIn);
	}
	
	public void enterUsername() {
		driver.type(loginPage.txtEmail, property.properties.getProperty("username"));
	}
	
	public void enterPassword() {
		driver.type(loginPage.txtPassword, property.properties.getProperty("password"));
	}
	
	public void clickSubmitButton() {
		driver.click(loginPage.buttonSignIn);
	}
	
	public void mouseHoverLinkMyAccount() {
		driver.mouseHover(myAccountPage.linkMyaccount);
	}
	
	public void logOut() {
		driver.click(myAccountPage.linkSignOut);
	}
	
	public void quitBrowser() {
		driver.quitBrowser();
	}

}
