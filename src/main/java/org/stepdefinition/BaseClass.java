package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	WebDriver d = Hook.d;

	public void sendUrl(String url) {
		d.get(url);
	}

	public String printValue(WebElement e, String v) {
		String v1 = e.getAttribute(v);
		return v1;
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public String text(WebElement e) {
		String txt = e.getText();
		return txt;
	}

	public void maximize() {
		d.manage().window().maximize();
	}

	public void btnClick(WebElement e) {
		e.click();
	}

	public void quit() {
		d.quit();
	}

	public void dragDrop(WebElement s, WebElement dest) {
		Actions acc = new Actions(d);
		acc.dragAndDrop(s, dest).perform();

	}

	public String getValue(WebElement s) {
		String string = s.getAttribute("value");
		return string;
	}

	public void dropDown(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}

}
