package com.project.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;

public class CustomerLogin extends BaseClass{

	@Test
	public void customerLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
	}
	
}
