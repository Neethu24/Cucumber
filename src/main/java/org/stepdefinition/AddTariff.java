package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariff extends AddTariffPage{
	
	
	AddTariffPage ap = new AddTariffPage();
	
	@Given("the user is in the add tariff plans")
	public void the_user_is_in_the_add_tariff_plans() {
		ap.sendUrl("http://demo.guru99.com/telecom/addtariffplans.php");
	}
	
	@When("the user enters vaild field values")
	public void the_user_enters_vaild_field_values() {
		ap.enterText(ap.getRental(), "111");
		ap.enterText(ap.getLocMins(), "222");
		ap.enterText(ap.getIntMins(), "333");
		ap.enterText(ap.getSmsPack(), "444");
		ap.enterText(ap.getMinCharges(), "555");
		ap.enterText(ap.getIntCharges(), "666");
		ap.enterText(ap.getSmsCharges(), "777");
		ap.getSubmit().click();
	}

	@Then("user plan is added")
	public void user_plan_is_added() {
		Assert.assertTrue(ap.text(ap.getCong()).contains("Congratulation"));
	}
}
