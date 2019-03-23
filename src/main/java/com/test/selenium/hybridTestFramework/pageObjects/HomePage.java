package com.test.selenium.hybridTestFramework.pageObjects;

import org.openqa.selenium.By;

import com.test.selenium.hybridTestFramework.base.LoadProperties;
import com.test.selenium.hybridTestFramework.base.Path;

public class HomePage extends LoadProperties{
	
	public static final String FILE_NAME = Path.getHomePagePath();

	public HomePage() {
		super(FILE_NAME);
	}
	
	public By linkSignIn = By.xpath(properties.getProperty("linkSignIn"));

}
