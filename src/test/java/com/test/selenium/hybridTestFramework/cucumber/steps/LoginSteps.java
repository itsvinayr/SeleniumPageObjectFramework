package com.test.selenium.hybridTestFramework.cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.selenium.hybridTestFramework.base.LoadProperties;
import com.test.selenium.hybridTestFramework.base.Path;
import com.test.selenium.hybridTestFramework.pageObjects.HomePage;
import com.test.selenium.hybridTestFramework.pageObjects.LoginPage;
import com.test.selenium.hybridTestFramework.pageObjects.MyAccountPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginSteps {
	
	public static WebDriver driver = null;
	public static final LoadProperties property = new LoadProperties(Path.getCredentialPath());
	public HomePage homePage = new HomePage();
	public LoginPage loginPage = new LoginPage();
	public MyAccountPage myAccountPage = new MyAccountPage();
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+Path.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Given("^user navigates to costco$")
	public void user_navigates_to_costco() throws Throwable {
	    System.out.println("user navigates to costco");
		driver.get(property.properties.getProperty("testURL"));
	}

	@When("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() throws Throwable {
		System.out.println("user clicks on sign in link");
		driver.findElement(homePage.linkSignIn).click();
	}

	@Then("^user enters username$")
	public void user_enters_username() throws Throwable {
	    System.out.println("user enters username");
	    driver.findElement(loginPage.txtEmail).sendKeys(property.properties.getProperty("username"));
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
	    System.out.println("user enters password");
	    driver.findElement(loginPage.txtPassword).sendKeys(property.properties.getProperty("password"));
	}

	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
	    System.out.println("user clicks on submit button");
	    driver.findElement(loginPage.buttonSignIn).click();
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	    System.out.println("user should login successfully");
	    Actions action = new Actions(driver);
	    WebElement mo = driver.findElement(myAccountPage.linkMyaccount);
	    action.moveToElement(mo).build().perform();
	    driver.findElement(myAccountPage.linkSignOut).click();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
