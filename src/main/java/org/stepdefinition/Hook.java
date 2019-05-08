package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver d;
	@Before
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Desktop/chromedriver");
		d = new ChromeDriver();
	}
	
	@After
	public void afterMethod() {
		d.close();
	}
	
}
