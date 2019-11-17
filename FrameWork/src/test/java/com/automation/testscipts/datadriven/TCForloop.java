package com.automation.testscipts.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCForloop {
	WebDriver driver=null;
	@BeforeTest
	public void init() {
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	@Test(dataProvider="getTestData")
	public void createEmployee(String username,String password,String firstname,String lastname ){
		
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void destory() {
	driver.quit();
	
}
	@DataProvider(name="getTestData")
	
	public String[][] getTestData() throws Exception {
		String[][] data=new String[2][4];
		Workbook workbook=WorkbookFactory.create(new FileInputStream(new File("E:\\Book2.xlsx")));
		Sheet sheet=workbook.getSheet("sheet1");
		for(int rowIndex=0;rowIndex<=1;rowIndex++) {
			for(int colIndex=0;colIndex<3;colIndex++) {
				data[rowIndex][colIndex]=sheet.getRow(rowIndex).getCell(colIndex).toString();
			}
		}
				
		workbook.close();
		return data;
	}

}
