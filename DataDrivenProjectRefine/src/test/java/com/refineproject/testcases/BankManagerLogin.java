package com.refineproject.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.refineproject.baseclass.ProjectBaseClass;

public class BankManagerLogin extends ProjectBaseClass{
	
	@Test
	public void bankManagerLoginfunc()
	{
		driver.findElement(By.xpath(or.getProperty("bankManagerLogin"))).click();
		log.debug("Clicked on Customer Login button");
		
		Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("addCustomer"))), "Login Unsuccessfull");
		log.debug("Checked Assertion");
	}
	
	

}
