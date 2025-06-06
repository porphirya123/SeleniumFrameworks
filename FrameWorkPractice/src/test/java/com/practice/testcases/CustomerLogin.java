package com.practice.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.practice.baseFile.BaseFile;

public class CustomerLogin extends BaseFile {
	
	@Test
	public void custLogin()
	{
//		wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(or.getProperty("customerLogin")))));
		
			Wait<WebDriver> fluentwait = new WebDriverWait(driver,Duration.ofSeconds(5))
				.withTimeout(Duration.ofSeconds(4))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
				fluentwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(or.getProperty("customerLogin")))));
			//	Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("customerLogin"))),"Element is not present");
				
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		driver.findElement(By.xpath(or.getProperty("custLogin"))).sendKeys(null);
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\FrameWorkPractice\\src\\test\\resources\\Screenshots\\test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("customerLogin"))),"Element is not present");
		logger.debug("Checked if Element is present or not");
		Reporter.log("Reporter - Checked if Element is present or not");
		
		
		
		
		
	}
	
	

}
