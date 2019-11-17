package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScre {
	
	@FindBy(id="txtUsername")
	private WebElement txtusername=null;
	@FindBy(id="txtPassword")
	private WebElement txtpassword=null;
	@FindBy(id="btnLogin")
	private WebElement btnLogin=null;
	
	public LoginScre(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	
	public void login(String username,String password) {
		
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnLogin.click();
	}
}
