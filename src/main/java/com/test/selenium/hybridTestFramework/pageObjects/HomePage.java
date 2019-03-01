package com.test.selenium.hybridTestFramework.pageObjects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class HomePage {
	
	private static Properties objectRepository = null;
	private static InputStream inputStream = null;

	public HomePage() {
		objectRepository = new Properties();
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\objectRepository\\homePage.properties");
			objectRepository.load(inputStream);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}

	public static By linkSignIn = By.xpath(objectRepository.getProperty("linkSignIn"));

}
