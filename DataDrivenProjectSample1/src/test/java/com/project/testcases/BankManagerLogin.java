package com.project.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;

public class BankManagerLogin extends BaseClass{
	
	@Test(priority=2)
	public void bankManagerLogin()
	{
		click("home");
		log.debug("Clicked on Home button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(or.getProperty("bankManagerLogin"))).click();
		log.debug("Clicked BankManagerLogin");
	//	Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("addCustomer"))), "Unable to click Home button");
		Reporter.log("Verification pass for AddCustomber button");
	
		
		
		
	
	}
	

}
