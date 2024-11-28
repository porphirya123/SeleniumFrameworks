package com.refineproject.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.refineproject.baseclass.ProjectBaseClass;

public class CustomerLogin extends ProjectBaseClass{
	
	
	@Test(invocationCount = 4, threadPoolSize=4)
	public void invocationcount()
	
	{
		System.out.println("Tesing thread pool size");
	}
	
	
	public void custLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		log.debug("Clicked on Customer Login successfully");
	}
	
	

}
