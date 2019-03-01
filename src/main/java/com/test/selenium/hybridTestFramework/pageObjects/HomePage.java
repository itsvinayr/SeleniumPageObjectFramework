package com.test.selenium.hybridTestFramework.pageObjects;

import org.openqa.selenium.By;

import com.test.selenium.hybridTestFramework.base.LoadProperties;

public class HomePage extends LoadProperties{
	
	public static final String FILE_NAME = "homePage.properties";

	public HomePage() {
		super(FILE_NAME);
	}
	
	public By linkSignIn = By.xpath(properties.getProperty("linkSignIn"));

}
