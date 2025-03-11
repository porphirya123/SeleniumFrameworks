package com.veromoda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesActions.HomePageAction;

public class TC01_LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		BasePage.setup();
	}
	
	@Test
	public void loginTest()
	{
		HomePageAction homepage = new HomePageAction();
		homepage.gotoDresses();
		homepage.gotoTops();
		homepage.gotoNewIn();
		
		
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		BasePage.teardown();
	}
	

}
