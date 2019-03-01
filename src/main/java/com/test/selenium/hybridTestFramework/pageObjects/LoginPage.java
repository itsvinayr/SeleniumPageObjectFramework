package com.test.selenium.hybridTestFramework.pageObjects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class LoginPage {
	
	private static Properties objectRepository = null;
	private static InputStream inputStream = null;
	
	public LoginPage() {
		objectRepository = new Properties();
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\objectRepository\\loginPage.properties");
			objectRepository.load(inputStream);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	public static By txtEmail = By.xpath(objectRepository.getProperty("txtEmail"));
	public static By txtPassword = By.xpath(objectRepository.getProperty("txtPassword"));
	public static By buttonSignIn = By.xpath(objectRepository.getProperty("buttonSignIn"));

}
