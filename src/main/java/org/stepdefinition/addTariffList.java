package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class addTariffList {
	WebDriver driver;
	@Given("the user is in the add tariff planss")
	public void the_user_is_in_the_add_tariff_planss() {
		 System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Desktop/chromedriver");
		  driver =new ChromeDriver();
		  driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	    
	}


@When("the user enters vaild field value")
public void the_user_enters_vaild_field_value(DataTable dataTable) {
//	List<String> list = dataTable.asList();
//		driver.findElement(By.id("rental1")).sendKeys(list.get(0));
//	    driver.findElement(By.name("local_minutes")).sendKeys(list.get(1));
//	    driver.findElement(By.name("inter_minutes")).sendKeys(list.get(2));
//	    driver.findElement(By.name("sms_pack")).sendKeys(list.get(3));
//	    driver.findElement(By.id("minutes_charges")).sendKeys(list.get(0));
//	    driver.findElement(By.id("inter_charges")).sendKeys(list.get(0));
//	    driver.findElement(By.id("sms_charges")).sendKeys(list.get(0));
//	    driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	
//	List<List<String>> list = dataTable.asLists();
//	driver.findElement(By.id("rental1")).sendKeys(list.get(0).get(2));
//    driver.findElement(By.name("local_minutes")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.name("inter_minutes")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.name("sms_pack")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.id("minutes_charges")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.id("inter_charges")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.id("sms_charges")).sendKeys(list.get(1).get(0));
//    driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	
//	Map<String, String> map = dataTable.asMap(String.class, String.class);
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("first"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("second"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("three"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("four"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("five"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("six"));
//	driver.findElement(By.name("local_minutes")).sendKeys(map.get("seven"));
//	driver.findElement(By.xpath("//input[@name='submit']")).click(); 
//	    
//	}
	
	List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
	driver.findElement(By.id("rental1")).sendKeys(map.get(0).get("first"));
	driver.findElement(By.name("local_minutes")).sendKeys(map.get(0).get("second"));
	driver.findElement(By.name("inter_minutes")).sendKeys(map.get(0).get("three"));
	driver.findElement(By.name("sms_pack")).sendKeys(map.get(0).get("four"));
	driver.findElement(By.id("minutes_charges")).sendKeys(map.get(0).get("five"));
	driver.findElement(By.id("inter_charges")).sendKeys(map.get(0).get("six"));
	driver.findElement(By.id("sms_charges")).sendKeys(map.get(0).get("seven"));
	driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	    
	}
	 
	

	@Then("user plan is addeds")
	public void user_plan_is_addeds() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2")).getText().contains("Congratulation"));
	    driver.quit();
	}

}
