package com.demo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demo.basepackage.ProjectBaseClass;


public class TC_01_LoginCustomer extends ProjectBaseClass{
	
	@Test
	public void loginCust()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		log.debug("User clicked on Customer Login Page");
		driver.findElement(By.xpath(or.getProperty("yourName"))).click();
		log.debug("user clicked on Your Name link");
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		log.debug("User clicked on Home button");
	}

}
