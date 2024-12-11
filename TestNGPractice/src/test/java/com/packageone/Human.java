package com.packageone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Human {

	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	@Test
	public void testOne() throws InterruptedException
	{
		System.out.println("Test One");
		driver = new ChromeDriver();
		driver.get("https://www.apple.com");
		Thread.sleep(5000);
		WebElement store = driver.findElement(By.xpath("(//*[contains(@aria-label, 'Store')])[1]"));
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.pollingEvery(Duration.ofSeconds(10))
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(store));
				
		Actions act = new Actions(driver);
		act.moveToElement(store).click().perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("test.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	@Test
//	public void testTwo()
//	{
//		System.out.println("Test Two");
//		driver = new FirefoxDriver();
//		driver.get("https://www.amazon.in");
//	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}

	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
}

class Child
{
WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
//	
//	@Test
//	public void testOne() throws InterruptedException
//	{
//		System.out.println("Test One");
//		driver = new ChromeDriver();
//		driver.get("https://www.apple.com");
//		Thread.sleep(5000);
//		
//	}
	
	
	@Test
	public void testTwo()
	{
		System.out.println("Test Two");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}

	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
