package com.refineproject.baseclass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.refineproject.utilities.ExtendManagerNew;
import com.relevantcodes.extentreports.LogStatus;

public class ProjectBaseClass {

	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public ExtentReports reo = ExtendManagerNew.getInstance();
	public static ExtentTest test;
	
	
	@BeforeSuite
	public void configSetup()
	{
		if(driver==null)
		{
			try
			{
			config=new Properties();
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\config.properties");
			config.load(fis);
			log.debug("Config file loaded successfully");
			
			or = new Properties();
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\or.properties");
			or.load(fis);
			log.debug("OR file loaded successfully");
			
			}catch(Exception e)
			{
				System.out.println("Problem with reading property file");
			}
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Launched!!");
				
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Launched!!");
			}
				
		}
		
		driver.manage().window().maximize();
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website Launched!!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	public boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by);
			log.debug("WebElement is present");
			return true;
			
		}catch (NoSuchElementException e)
		{
			log.debug("WebElement is not present");
			return false;
		}
	}

	public void click(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void sendText(String locator, String text)
	{
		driver.findElement(By.xpath(or.getProperty("locator"))).sendKeys(text);
		
	}
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
