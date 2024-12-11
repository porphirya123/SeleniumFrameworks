package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class CustomerLogin extends BaseClass{
	
	
	
	@Test
	public void custLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
	}
	
	

}
