package com.test.selenium.hybridTestFramework.base;

public class Path {
	
	public static String credentialPath = "\\src\\test\\resources\\envFiles\\credentials.properties";
	public static String chromeDriverPath = "\\src\\main\\resources\\drivers\\chromedriver.exe";
	public static String firefoxDriverPath = "\\src\\main\\resources\\drivers\\geckodriver.exe";
	public static String homePagePath = "\\src\\main\\resources\\objectRepository\\homePage.properties";
	public static String loginPagePath = "\\src\\main\\resources\\objectRepository\\loginPage.properties";
	public static String myAccountPagePath = "\\src\\main\\resources\\objectRepository\\myAccountPage.properties";
	
	public static String getCredentialPath() {
		return credentialPath;
	}
	public static String getChromeDriverPath() {
		return chromeDriverPath;
	}
	public static String getFirefoxDriverPath() {
		return firefoxDriverPath;
	}
	public static String getHomePagePath() {
		return homePagePath;
	}
	public static String getLoginPagePath() {
		return loginPagePath;
	}
	public static String getMyAccountPagePath() {
		return myAccountPagePath;
	}

}
