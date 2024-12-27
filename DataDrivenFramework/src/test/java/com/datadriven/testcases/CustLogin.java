package com.datadriven.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.datadriven.baseclass.BaseFile;

public class CustLogin extends BaseFile{
	
	@Test(priority =1)
	public void customerClick()
	{
		
		click("customerLogin");
		log.debug("Clicked on Customer Login");
		click("home");
		log.debug("Clicked on Home button");
		
		
		
		//Assert.fail();
		
		
	}
	
	

}
