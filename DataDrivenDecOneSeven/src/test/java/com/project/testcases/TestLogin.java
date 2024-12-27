package com.project.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.baseclass.BaseClass;
import com.project.utilities.Utilities;

public class TestLogin extends BaseClass{
	
	{
		//WebElement customer = driver.findElement(By.xpath(or.getProperty("customerLogin")));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(or.getProperty("customerLogin")))));
		Utilities.takeScreenshot();
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		Assert.fail();
		
		
	}

}
