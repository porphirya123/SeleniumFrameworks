package com.practice.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practice.basetest.BaseTestFile;

public class AddCustomerLogin extends BaseTestFile{
	
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
	}

}
