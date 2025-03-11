package com.way2automation.basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseFile {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public String configpath = "C:\\eclipse-workspace\\Way2AutomationDataDriven\\src\\test\\resources\\propertyfiles\\config.properties";
	public String orpath = "C:\\eclipse-workspace\\Way2AutomationDataDriven\\src\\test\\resources\\propertyfiles\\or.properties";
	
	@BeforeSuite
	public void initialSetup()
	{
		if(driver==null)
		{
			config = new Properties();
			try {
				fis = new FileInputStream(configpath);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config file loaded successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			or = new Properties();
			try {
				fis = new FileInputStream(orpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				or.load(fis);
				log.debug("Object Repository file loaded successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(config.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Browser loaded successfully");
			}
			else if(config.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Browser loaded successfully");
			}
		}
		
		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website got launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.debug("Implicit wait got added");

	}

	public static void click(String ele)
	{
		driver.findElement(By.xpath(or.getProperty(ele))).click();
	}
	
	public static void sendText(String ele, String txt)
	{
		driver.findElement(By.xpath(or.getProperty(ele))).sendKeys(txt);
	}
	
	
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
