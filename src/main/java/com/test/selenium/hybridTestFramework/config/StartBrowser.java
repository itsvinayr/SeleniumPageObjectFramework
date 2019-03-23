package com.test.selenium.hybridTestFramework.config;

import org.testng.annotations.BeforeClass;

import com.test.selenium.hybridTestFramework.base.Path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {

	public static WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Path.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
		
	}

}
