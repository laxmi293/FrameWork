package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenFlight {

	@FindBy(name = "reserveFlights")
	private WebElement bcontinue=null;
	public ScreenFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void click() {
		bcontinue.click();
	}


}
