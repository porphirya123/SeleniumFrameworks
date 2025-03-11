package com.project.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.basepackage.BaseClass;
import com.project.utilities.CommonUtilities;

public class TC_001_CustomerLogin extends BaseClass{
	
	
	
	@Test
	public void customerLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		log.debug("User clicked on Customer Login Page");
		driver.findElement(By.xpath(or.getProperty("yourName"))).click();
		log.debug("user clicked on Your Name link");
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		CommonUtilities.takescreenshot();
		log.debug("User clicked on Home button");
		
		
	}

}
