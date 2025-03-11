package com.veromoda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesActions.TopNavigationAction;

public class TC03_TopNavigation {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		BasePage.setup();
	}
	
	@Test
	public void topPage()
	{
		TopNavigationAction topnavobj = BasePage.topmenu;
		topnavobj.gotoCart();
		BasePage.topmenu.gotoFavourites();
		BasePage.topmenu.gotoMyAccount();
		BasePage.topmenu.gotoSearch();
	}
	
	@AfterTest
	public void teardown()
	{
		BasePage.teardown();
	}
	

}
