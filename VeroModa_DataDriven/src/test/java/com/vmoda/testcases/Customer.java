package com.vmoda.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vmoda.base.BaseClass;

public class Customer extends BaseClass{

	@Test
	public void custLogin()
	{
		click("customerLogin");
		log.debug("User clicked on Customer Login button");
		//click("yourName");
		log.debug("User clicked on User dropdown");
		selectDropdown("yourName", "1" );
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
