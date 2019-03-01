package com.test.selenium.hybridTestFramework.pageObjects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class MyAccountPage {
	
	private static Properties objectRepository = null;
	private static InputStream inputStream = null;
	
	public MyAccountPage() {
		objectRepository = new Properties();
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\objectRepository\\myAccountPage.properties");
			objectRepository.load(inputStream);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	public static By linkMyaccount = By.xpath(objectRepository.getProperty("linkMyaccount"));
	public static By linkSignOut = By.xpath(objectRepository.getProperty("linkSignOut"));

}
