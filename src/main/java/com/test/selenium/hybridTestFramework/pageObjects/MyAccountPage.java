package com.test.selenium.hybridTestFramework.pageObjects;

import org.openqa.selenium.By;

import com.test.selenium.hybridTestFramework.base.LoadProperties;

public class MyAccountPage extends LoadProperties{
	
	public static final String FILE_NAME = "myAccountPage.properties";
	
	public MyAccountPage() {
		super(FILE_NAME);
	}
	
	public By linkMyaccount = By.xpath(properties.getProperty("linkMyaccount"));
	public By linkSignOut = By.xpath(properties.getProperty("linkSignOut"));

}
