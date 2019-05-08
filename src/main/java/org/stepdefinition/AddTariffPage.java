package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTariffPage extends BaseClass {
	
	public AddTariffPage() {
		PageFactory.initElements(d,this);
	}

	@FindBy(name = "rental")
	private WebElement rental;

	@FindBy(name = "local_minutes")
	private WebElement locMins;

	@FindBy(name = "inter_minutes")
	private WebElement intMins;

	@FindBy(name = "sms_pack")
	private WebElement smsPack;

	@FindBy(id = "minutes_charges")
	private WebElement minCharges;

	@FindBy(id = "inter_charges")
	private WebElement intCharges;

	@FindBy(id = "sms_charges")
	private WebElement smsCharges;

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement submit;

	@FindBy(xpath = "//h2")
	private WebElement cong;

	
	
	public WebElement getRental() {
		return rental;
	}

	public WebElement getLocMins() {
		return locMins;
	}

	public WebElement getIntMins() {
		return intMins;
	}

	public WebElement getSmsPack() {
		return smsPack;
	}

	public WebElement getMinCharges() {
		return minCharges;
	}

	public WebElement getIntCharges() {
		return intCharges;
	}

	public WebElement getSmsCharges() {
		return smsCharges;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCong() {
		return cong;
	}
	
	

}
