package com.way2automation.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.way2automation.basepackage.BaseFile;

public class TC_01_CustomerLogin extends BaseFile {
	
	@Test
	public void customerLogin()
	{
		click("customerLogin");
		Assert.assertFalse(false);
		
		click("yourName");
		//driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		//driver.findElement(By.xpath(or.getProperty("yourName"))).click();
	}

}
