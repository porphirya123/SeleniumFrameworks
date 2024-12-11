package com.project.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	
	
	
	@BeforeSuite
	public void setup()
	{
		if(driver==null)
		{
			try
			{
			config = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\propertyfiles\\config.properties");
			config.load(fis);
			log.debug("Config file loaded");
			
			or = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\propertyfiles\\or.properties");
			or.load(fis);
			log.debug("OR file loaded");
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome driver file loaded");
			}
			else if(config.getProperty("browser").equals("chrome"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox driver file loaded");
			}
			
			driver.manage().window().maximize();
			log.debug("window maximized");
			driver.get(config.getProperty("websiteurl"));
			log.debug("Website launched");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}

	}

	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	public static void click(String element)
	{
		driver.findElement(By.xpath(or.getProperty(element))).click();
	}
	
	
	public static void textInput(String element, String text)
	{
		driver.findElement(By.xpath(or.getProperty(element))).sendKeys(text);
	}
	
	
	public static boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	
	
	
}

