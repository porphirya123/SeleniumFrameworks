package com.project.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.baseclass.BaseClass;

public class AddCustomer extends BaseClass{
	
	
	@Test(priority =3 )
	public void addCusotmer()
	{
		
		driver.findElement(By.xpath(or.getProperty("addCustomer"))).click();
		log.debug("Clicked on Add Customer button");
		//Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("firstName"))),"Test Failed");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.findElement(By.xpath(or.getProperty("firstName"))).sendKeys("Santosh");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\testdata\\test.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		textInput("firstName", fName);
//		textInput("lastName", lName);
//		textInput("postCode", pCode);
//		
//		
//		click("addCustomerbutton");
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
					
//		textInput("firstName", fName);
//		textInput("lastName", lName);
//		textInput("postCode", pCode);
//		click("addCustomerbutton");
//		driver.switchTo().alert();
//		alert.accept();
		
		
		
	}
	
	
//	@DataProvider (name = "dataprovider")
//	public Object[][] getCustomerDetails()
//	{
//		Object[][] data = new Object[2][3];
//		data[0][0]= "Santosh";
//		data[0][1]= "Kumar";
//		data[0][2]= "3232";
//		
//		data[1][0]= "Ankita";
//		data[1][1]= "Aggarwal";	
//		data[1][2]= "564232";
//		
//		return data;
//		
//		
//	}
//	
	

}
