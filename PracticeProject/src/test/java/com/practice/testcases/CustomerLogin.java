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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.BaseTest.BaseFile;

public class CustomerLogin extends BaseFile{
	
	
	@Test
	public void CustLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File file = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\eclipse-workspace\\PracticeProject\\src\\test\\resources\\screenshots\\test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		
		WebElement homebutton = driver.findElement(By.xpath(or.getProperty("home")));
		
		Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("home"))), "Home button not available");
		
		wait.until(ExpectedConditions.elementToBeClickable(homebutton));
		
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(4))
				.withTimeout(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(homebutton));
		
		
		
	}
	
	

}
