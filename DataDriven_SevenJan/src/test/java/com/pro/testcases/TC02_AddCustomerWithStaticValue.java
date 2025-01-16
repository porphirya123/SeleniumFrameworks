package com.pro.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pro.base.ProjectBaseClass;
import com.pro.utilities.ExcelReader;

public class TC02_AddCustomerWithStaticValue extends ProjectBaseClass{

	
	@Test(dataProvider = "getvalues")
	public void addCustomer(String fname, String lname, String postcode)
	{
	
		driver.findElement(By.xpath(or.getProperty("bankManagerLogin"))).click();
		driver.findElement(By.xpath(or.getProperty("addCustomer"))).click();
		driver.findElement(By.xpath(or.getProperty("firstName"))).sendKeys(fname);
		driver.findElement(By.xpath(or.getProperty("lastName"))).sendKeys(lname);
		driver.findElement(By.xpath(or.getProperty("postCode"))).sendKeys(postcode);
		driver.findElement(By.xpath(or.getProperty("addCustomerbutton"))).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		
	}

	
	@DataProvider(name = "getvalues")
	public String[][] getvalue()
	{
		
		String[][] values = new String[2][3];
		values[0][0] = "Sumit";
		values[0][1] = "Aggarwal";
		values[0][2] = "201333";

		values[1][0] = "Rohan";
		values[1][1] = "Verma";
		values[1][2] = "201333";
		
		return values;
		
	}
	
}
