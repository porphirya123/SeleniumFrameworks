package com.seleniumbasics.practice;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	
	public static WebDriver driver;
	
	
	
	SeleniumWait()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		
		WebElement bankmanagerLogin = driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeSelected(bankmanagerLogin));
		
		Wait<WebDriver> newwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(4))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		newwait.until(ExpectedConditions.elementToBeSelected(bankmanagerLogin));
		
		bankmanagerLogin.click();
		
		TakesScreenshot src = (TakesScreenshot)driver;
		File file = src.getScreenshotAs(OutputType.FILE)
		
		
	}
	
	
	public void teardown()
	{
		driver.quit();
	}
	
	
	public static void main(String[] args)
	{
		
		
		SeleniumWait obj = new SeleniumWait();
		
		obj.teardown();
	}
	

}
