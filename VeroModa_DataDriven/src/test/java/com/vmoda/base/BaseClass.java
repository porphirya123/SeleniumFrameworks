package com.vmoda.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriver wait;
	
	@BeforeSuite
	public static void config()
	{
		try
		{
		config = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\config.properties");
		config.load(fis);
		log.debug("Config file uploaded");
		
		or = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\or.properties");
		or.load(fis);
		log.debug("Or file uploaded");
		
		if(config.getProperty("browser").equals("chrome"))
		{
			
			driver = new ChromeDriver();
			log.debug("Chrome browser intentiated");
					
		}else if(config.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("Firefox browser intentiated");
		}
		
		}catch(Exception e)
		{
			System.out.println("Something went wrong" + e.getMessage());
		}
		
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched");
		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.debug("Implicit wait time got added");
	}
	
	public static void click(String element)
	{
		driver.findElement(By.xpath(or.getProperty(element))).click();
	}
	
	public static void sendText(String element, String text)
	{
		driver.findElement(By.xpath(or.getProperty(element))).sendKeys(text);;
	}
	
	
	public static void selectDropdown(String ele, String value)
	{
		Select sl = new Select(driver.findElement(By.xpath(or.getProperty(ele))));
		sl.selectByValue(value);
		//sl.selectByVisibleText(value);
			
	}
	
	
	//@AfterSuite
	public static void teardown()
	{
		driver.quit();
		log.debug("Browser got closed");
	}
	
	
	
	

}
