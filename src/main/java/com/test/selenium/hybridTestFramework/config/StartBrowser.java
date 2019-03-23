package com.test.selenium.hybridTestFramework.config;

import com.test.selenium.hybridTestFramework.base.Path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {

	public static WebDriver driver = null;
	
	public StartBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Path.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
