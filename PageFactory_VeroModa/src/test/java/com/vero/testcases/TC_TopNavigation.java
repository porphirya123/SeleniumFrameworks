package com.vero.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vero.page.BasePage;
import com.vero.page.TopNavigation;

public class TC_TopNavigation {

	

	@BeforeTest
	public void browserConfig()
	{
		BasePage.setup();
	}
	
	@Test
	public void testTopNav()
	{
	TopNavigation tp = BasePage.topnav;
	BasePage.topnav.gotoFavourites();
	BasePage.topnav.gotoMyAccount();
	BasePage.topnav.gotoSearch();
	}
	
	

	@AfterTest
	public void browserquit()
	{
	BasePage.exit();
	}
	
	
}
