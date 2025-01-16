package com.pro.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pro.base.ProjectBaseClass;
import com.pro.utilities.ExcelReader;

public class TC03_AddCustomeUsingExcel extends ProjectBaseClass {
	
	@Test(dataProvider = "getdata", dataProviderClass = ExcelReader.class)
	public void addCustomer(String fname, String lname, String postcode, String alertMsg)
	{
	
		driver.findElement(By.xpath(or.getProperty("bankManagerLogin"))).click();
		driver.findElement(By.xpath(or.getProperty("addCustomer"))).click();
		driver.findElement(By.xpath(or.getProperty("firstName"))).sendKeys(fname);
		driver.findElement(By.xpath(or.getProperty("lastName"))).sendKeys(lname);
		driver.findElement(By.xpath(or.getProperty("postCode"))).sendKeys(postcode);
		driver.findElement(By.xpath(or.getProperty("addCustomerbutton"))).click();
		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert();
//		Assert.assertTrue(alert.getText().contains(alertMsg));
//		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		
	}

}
