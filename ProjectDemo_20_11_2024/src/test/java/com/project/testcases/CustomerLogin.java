package com.project.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.project.BaseClass.BaseClass;

public class CustomerLogin extends BaseClass{
	
	
	@Test
	public void custLogin()
	{
		
		driver.findElement(By.xpath(or.getProperty("custLogin"))).click();
		log.debug("Clicked on Customer Login successfully");
	//	screenshot();
		Assert.assertTrue(isElementAvailable(By.xpath(or.getProperty("yourName"))), "Customer Login is not successful");
		
	}
	

}
