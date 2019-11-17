package com.automation.testscipts.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2CreateEmployeetestng {
	
	WebDriver driver=null;
	@BeforeTest
	public void init() {
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	@Test
	public void createEmployee(){
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	driver.findElement(By.name("firstName")).sendKeys("laxmi");
	driver.findElement(By.name("lastName")).sendKeys("G");
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void destory() {
	driver.quit();

}
}