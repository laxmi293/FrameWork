package com.automation.testscipts.PageObjectModel;

import org.testng.annotations.Test;

import com.automation.core.FrameWorkScript;
import com.automation.screens.BookaTicket;
import com.automation.screens.FlightFinder;
import com.automation.screens.LoginScreen;
import com.automation.screens.ScreenFlight;

public class TC_1BookATicket extends FrameWorkScript {
	@Test
	public void BookTicket() {
		driver.get("http://www.newtours.demoaut.com/");
		
		LoginScreen screen=new LoginScreen(driver);
		screen.login("mercury","mercury");
		
		FlightFinder finder=new FlightFinder(driver);
		finder.clickonContinue();
		
		ScreenFlight screenFlight=new ScreenFlight(driver);
		screenFlight.click();
		
		BookaTicket bookaTicket=new BookaTicket(driver);
		bookaTicket.enterDetails("srikrishna","a");
		
	}
	

}
