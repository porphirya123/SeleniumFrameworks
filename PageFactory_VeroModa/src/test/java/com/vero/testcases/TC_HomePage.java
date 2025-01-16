package com.vero.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vero.page.BasePage;
import com.vero.pages.actions.Cart;
import com.vero.pages.actions.HomePage;

public class TC_HomePage {
	
	
	
	@BeforeTest
	public void browserConfig()
	{
		BasePage.setup();
	}
	
	
	
	@Test
	public void testHomePage()
	{
		HomePage hm = new HomePage();
		hm.gotoAllProducts();
		hm.gotoDresses();
		hm.gotoNewIn();
		hm.gotoTops();
	
	}
	
	

	@AfterTest
	public void browserquit()
	{
	BasePage.exit();
	}
	
		
		
	
	

}
