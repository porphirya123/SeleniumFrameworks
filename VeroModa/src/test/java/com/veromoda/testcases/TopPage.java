package com.veromoda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basePage.BasePage;
import com.veromoda.pageActions.TopNavigation;

public class TopPage {
	
	public static WebDriver driver;

	@BeforeTest
	public void setup()
	{
		BasePage.config();
	}
	
	@Test
	public static void topPage() {
					
		TopNavigation tp = BasePage.topnav;
		tp.gotoCart();
		BasePage.topnav.gotoFavourites();
		BasePage.topnav.gotoMyAccount();
		BasePage.topnav.gotoSearch();
		
		
	}
	
	@AfterTest
	public void exit()
	{
		BasePage.teardown();
	}
	
}
