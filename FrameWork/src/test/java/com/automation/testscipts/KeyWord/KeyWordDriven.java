package com.automation.testscipts.KeyWord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.core.FrameWorkScript;
import com.automation.helper.KeyExcelHelper;

public class KeyWordDriven extends FrameWorkScript {
	
	
	
	
	@Test(dataProvider = "getTestData")	
	
		public void test(String testName,String stepDescription,String action,String properties,String data) throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		actionsHelper(action,properties,data);
			}
	public void actionsHelper(String action,String properties,String data) throws Exception {
		
		WebElement element=null;
		Actions actions=null;
		
		if(properties!=null) {
			 element=findElement(properties);
			 }
		switch(action) {
		case "enterurl":
			driver.get(data);
			break;
		case "setText":
			element.sendKeys(data);
			break;
			
		case "click":
		element.click();
			break;
		
		case "doubleclick":
			actions=new Actions(driver);
			actions.doubleClick(element).perform();
			break;
		
		case "rightClick":
			actions=new Actions(driver);
			actions.contextClick(element).perform();
			break;
		
		case "moveToElement":
			actions= new Actions(driver);
			actions.moveToElement(element).perform();
			break;
		
		case "delay":
			Thread.sleep(Long.parseLong(data));
			break;
		
		}
	}
	
	
	
	
	public WebElement findElement(String properties) {
		WebElement element=null;
			String locatorType=properties.split("=")[0];
			String locatorValue=properties.split("=")[1];
			switch (locatorType) {
			case "id":
				element=driver.findElement(By.id(locatorValue));
				break;
			case "name":
				element=driver.findElement(By.name(locatorValue));
				break;
			case "classname":
				element=driver.findElement(By.className(locatorValue));
				break;
			case "linktext":
				element=driver.findElement(By.linkText(locatorValue));
				break;
			case "xpath":
				element=driver.findElement(By.xpath(locatorValue));
				break;
			case "tagname":
				element=driver.findElement(By.tagName(locatorValue));
				break;
}
			return element;

	}
	@DataProvider
	public String[][] getTestData() throws Exception{
		return KeyExcelHelper.getTestData();
	}

}
