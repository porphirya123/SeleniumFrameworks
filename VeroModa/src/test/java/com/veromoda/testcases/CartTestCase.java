package com.veromoda.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basePage.BasePage;
import com.veromoda.pageActions.Cart;

public class CartTestCase {
	
	@BeforeTest
	public void setup()
	{
		BasePage.config();
	}
	
	
	@Test
	public static void getCart()
	{
		
		
		Cart cart = new Cart();
		cart.gotoContactUs();
		cart.gotoFAQ();
		
	}

	@AfterTest
	public void exit()
	{
		BasePage.teardown();
	}
	
}

