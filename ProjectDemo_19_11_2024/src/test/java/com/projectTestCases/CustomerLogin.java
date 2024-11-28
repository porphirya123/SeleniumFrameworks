package com.projectTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.projectBaseClass.ProjectBaseClass;

public class CustomerLogin extends ProjectBaseClass{
	
	@Test
	public void CustomerLogin()
	{
		
	
		driver.findElement(By.xpath(or.getProperty("custLogin"))).click();
		
		Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("custLogin"))), "Element is not present");
		log.debug("Clicked on Customer Login successfully");
		getScreenshot();
		
		
	}

}
