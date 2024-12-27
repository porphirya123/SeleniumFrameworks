package com.veromoda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basePage.BasePage;
import com.veromoda.pageActions.HomePage;
import com.veromoda.pageActions.TopNavigation;

public class LoginTest {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		BasePage.config();
	}
	
	@Test
	public static void LoginTest()
	{
		
		
		HomePage hm = new HomePage();
		hm.gotoAllProducts();
		hm.gotoDresses();
		hm.gotoTops();
		hm.gotoNewIn();
				
	}
	
	@AfterTest
	public void exit()
	{
		BasePage.teardown();
	}

}
