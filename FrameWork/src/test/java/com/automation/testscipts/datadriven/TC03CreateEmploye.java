package com.automation.testscipts.datadriven;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.automation.core.FrameWorkScript;
import com.automation.helper.ExcelHelper;


public class TC03CreateEmploye extends FrameWorkScript {

	@Test(dataProvider="getTestData")
	public void createEmployee(String username,String password,String firstname,String lastname ) throws Exception{
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	}

@DataProvider
	
	public static String[][] getTestData() throws Exception {
		return ExcelHelper.getTestData();
}
}

