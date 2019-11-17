package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutScreen {
	
	
	
	@FindBy(linkText = "Welcome Admin")
	private WebElement linkWelcome=null;
	
	@FindBy(linkText = "Logout")
	private WebElement lnkLogout=null;
	
	
	public LogoutScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signoff() {
		linkWelcome.click();
		lnkLogout.click();
	}
}
