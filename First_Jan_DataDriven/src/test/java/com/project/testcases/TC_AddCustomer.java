package com.project.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.base.Baseclass;

public class TC_AddCustomer extends Baseclass{ 
	
	
	@Test
	public void addCustomer()
	{
		
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		log.debug("Clicked on Customer Login link");
		driver.findElement(By.xpath(or.getProperty("yourName"))).click();
		log.debug("Clicked on Your Name dropdown link");
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		log.debug("Home link clicked");

	}
	

}
