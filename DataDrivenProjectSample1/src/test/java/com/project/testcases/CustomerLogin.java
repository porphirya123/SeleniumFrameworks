package com.project.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;

public class CustomerLogin extends BaseClass{
	
	@Test(priority =1)
	public void custLogin()
	{

	System.setProperty("org.uncommons.reportng.escape-output", "false");
	click("customerLogin");
	log.debug("Clicked on Website Login");
	Reporter.log("Clicked on Website Login");
	Reporter.log("<a href=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg\" target = \"_blank\">Screenshot</a>");
	Reporter.log("<br>");
	Reporter.log("<a target =\"_blank\" href=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg \"><img src=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg\" height=200 width=200></img></a>");
	Reporter.log("<br>");
	Reporter.log("Clicked on Website Login");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("addCustomer"))), "Login not successful");
	
	

	}
}
