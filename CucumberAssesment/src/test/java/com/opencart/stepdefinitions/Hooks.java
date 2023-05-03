package com.opencart.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.opencart.utilities.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends Base{
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	    }
	}
		@After(order=0)
		public void quitbrowser() {
			driver.quit();
		}

}
