package com.automation.testscipts.HybridAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.core.FrameWorkScript;
import com.automation.helper.ExcelHelper;
import com.automation.screens.EmployeeScreen;
import com.automation.screens.LoginScre;
import com.automation.screens.LogoutScreen;

public class TC_01CreateEmployee extends FrameWorkScript {
	@Test(dataProvider = "getTestData")
	public void createEmployee(String username,String password,String firstname,String lastname) {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		LoginScre loginScre=new LoginScre(driver);
		loginScre.login(username, password);
		
		EmployeeScreen employeeScreen=new EmployeeScreen(driver);
		employeeScreen.enterDetails(firstname, lastname);
		
		LogoutScreen logoutScreen=new LogoutScreen(driver);
		logoutScreen.signoff();
		
	}
	
	@DataProvider
	
	public String[][] getTestData () throws Exception {
		return ExcelHelper.getTestData();
	}
}
