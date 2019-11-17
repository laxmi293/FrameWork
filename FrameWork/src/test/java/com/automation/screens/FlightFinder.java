package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
	@FindBy(name = "findFlights")
	private WebElement btncontinue=null;
	
	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonContinue() {
		btncontinue.click();
		
	}

}
