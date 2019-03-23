package com.test.selenium.hybridTestFramework.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.selenium.hybridTestFramework.config.StartBrowser;

public class ActionDriver {
	
	WebDriver driver;
	
	public ActionDriver() {
		driver = StartBrowser.driver;
	}
	
	/**
	 * Launches application
	 * @param url -- Application URL
	 * Example: http://costco.com
	 */
	public void launchApplication(String url) {
		driver.get(url);
	}
	
	/**
	 * Clicks on the locator
	 * @param locator
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * types in testData into the locator
	 * @param locator
	 * @param testData
	 */
	public void type(By locator, String testData) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(testData);
	}
	
	/**
	 * hovers mouse over locator
	 * @param locator
	 */
	public void mouseHover(By locator) {
		Actions action = new Actions(driver);
		WebElement mo = driver.findElement(locator);
		action.moveToElement(mo).build().perform();
	}
	
	/**
	 * quit the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
