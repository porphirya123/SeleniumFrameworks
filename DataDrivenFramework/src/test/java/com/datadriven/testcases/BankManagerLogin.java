package com.datadriven.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.datadriven.baseclass.BaseFile;
import com.datadriven.utilities.CommonUtilities;

public class BankManagerLogin extends BaseFile{

	
	@Test(priority =2)
	public void bankmanagerLogin() throws IOException
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(or.getProperty("bankManagerLogin")))));
		
		log.debug("Added Implicit wait");
		
		click("bankManagerLogin");
		log.debug("Clicked on BankManagerLogin");
		
		
		
		click("addCustomer");
		
		verifyEquals("test", "Test");
		
		log.debug("Clicked on Add Customer button");
		sendValue("firstName", "Santosh");
		log.debug("Input First Name");
		sendValue("lastName", "Kumar");
		log.debug("Input Last Name");
		sendValue("postCode", "123223");
		log.debug("Input Post Code");
		click("addCustomerbutton");
		log.debug("Clicked on Add button");
		
		CommonUtilities.handleAlert();
		log.debug("Captured Alerts and accepted it");
	}
	
}
