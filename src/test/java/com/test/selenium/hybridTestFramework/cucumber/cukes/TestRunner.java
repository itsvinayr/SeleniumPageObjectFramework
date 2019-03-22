package com.test.selenium.hybridTestFramework.cucumber.cukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/featureFiles"},
					glue= {"com/test/selenium/hybridTestFramework/cucumber/steps"},
					monochrome=true)
public class TestRunner {

}
