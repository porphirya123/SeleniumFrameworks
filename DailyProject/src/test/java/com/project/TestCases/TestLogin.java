package com.project.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.project.BaseClass.BaseClass;

public class TestLogin extends BaseClass{
	
	@Test
	public void test()
	{
	
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
