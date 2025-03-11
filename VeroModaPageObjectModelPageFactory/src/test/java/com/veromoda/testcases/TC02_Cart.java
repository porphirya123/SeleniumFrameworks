package com.veromoda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesActions.CartAction;

public class TC02_Cart {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		BasePage.setup();
	}
	
	
	@Test
	public void callCartActions()
	{
		CartAction cartobj = new CartAction();
		cartobj.gotoContactUs();
		cartobj.gotoFAQ();
		cartobj.gotoFindAStore();
	}
	
	@AfterTest
	public void teardown()
	{
		BasePage.teardown();
	}

}
