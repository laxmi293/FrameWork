package com.automation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeScreen {
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement lnkPin=null;
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement lnkAddEmployee=null;
	@FindBy(id = "firstName")
	private WebElement txtfirstname=null;
	@FindBy(id = "lastName")
	private WebElement txtlastname=null;
	@FindBy(id="btnSave")
	private WebElement btnsave=null;
	
	public EmployeeScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterDetails(String firstname,String lastname) {
		lnkPin.click();
		lnkAddEmployee.click();
		txtfirstname.sendKeys(firstname);
		txtlastname.sendKeys(lastname);
		btnsave.click();
	}

}
