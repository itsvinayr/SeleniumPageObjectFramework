package com.test.selenium.hybridTestFramework.pageObjects;

import org.openqa.selenium.By;

import com.test.selenium.hybridTestFramework.base.LoadProperties;

public class LoginPage extends LoadProperties{
	
	public static final String FILE_NAME = "loginPage.properties";
	
	public LoginPage() {
		super(FILE_NAME);
	}
	
	public By txtEmail = By.xpath(properties.getProperty("txtEmail"));
	public By txtPassword = By.xpath(properties.getProperty("txtPassword"));
	public By buttonSignIn = By.xpath(properties.getProperty("buttonSignIn"));

}
