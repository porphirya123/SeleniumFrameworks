package com.vero.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vero.page.BasePage;
import com.vero.page.TopNavigation;
import com.vero.pages.actions.Cart;

public class TC_Cart {

	

	@BeforeTest
	public void browserConfig()
	{
		BasePage.setup();
	}
	
	@Test
	public void testCart()
	{
		Cart cart = new Cart();
		cart.gotoContactUs();
		cart.gotoFindAStore();
		cart.gotoFAQ();
	
	}
	
	

	@AfterTest
	public void browserquit()
	{
	BasePage.exit();
	}
	
		
		
		
		
	}
	
	
	

