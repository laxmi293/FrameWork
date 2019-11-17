package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
	
	@FindBy(name ="userName")
	private WebElement txtusername=null;
	@FindBy(name = "password")
	private WebElement txtpassword=null;
	@FindBy(name = "login")
	private WebElement btnlogin=null;
	public LoginScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void login(String username,String password) {
			txtusername.sendKeys(username);
			txtpassword.sendKeys(password);
			btnlogin.click();
			
		}
	
	}
