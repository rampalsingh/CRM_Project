package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	static WebDriver driver;

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		
		
		
		System.setProperty("webdriver.MicrosoftWebDriver.driver", "//MicrosoftWebDriver.exe");

		driver = new EdgeDriver(cap);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://yahoo.com");
		driver.quit();
	}

}
