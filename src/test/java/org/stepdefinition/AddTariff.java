package org.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariff {
	WebDriver driver;
	@Given("the user is in the add tariff plans")
	public void the_user_is_in_the_add_tariff_plans() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Desktop/chromedriver");
		  driver =new ChromeDriver();
		  driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("the user enters vaild field values")
	public void the_user_enters_vaild_field_values() {
		
		driver.findElement(By.id("rental1")).sendKeys("11");
	    driver.findElement(By.name("local_minutes")).sendKeys("44");
	    driver.findElement(By.name("inter_minutes")).sendKeys("333");
	    driver.findElement(By.name("sms_pack")).sendKeys("444");
	    driver.findElement(By.id("minutes_charges")).sendKeys("888");
	    driver.findElement(By.id("inter_charges")).sendKeys("999");
	    driver.findElement(By.id("sms_charges")).sendKeys("666");
	    driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	    
	}

	@Then("user plan is added")
	public void user_plan_is_added() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2")).getText().contains("Congratulation"));
	    driver.quit();
	}
}
