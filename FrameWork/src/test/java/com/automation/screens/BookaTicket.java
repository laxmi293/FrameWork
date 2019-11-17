package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaTicket {
	@FindBy(name ="passFirst0")
	private WebElement txtFirstname=null;
	@FindBy(name = "passLast0")
	private WebElement txtLastname=null;
	@FindBy(name = "buyFlights")
	private WebElement btnFlight=null;
	@FindBy(linkText = "SIGN-OFF")
	private WebElement btnsignoff=null;
	public BookaTicket(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String firstname, String lastname) {
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		btnFlight.click();
		btnsignoff.click();		
	}
		

}
