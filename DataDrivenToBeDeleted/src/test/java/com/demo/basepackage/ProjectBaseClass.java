package com.demo.basepackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/*
 * Setup BaseClass - DONE
 * Create TC - DONE
 * Configure Log - DONE
 * Convert TestSuite into TestNG and Run from TestNG.xml File - DONE
 * Add 2nd TC with DataProvider - 
 * Configure Listeners - 
 * Configure ReportNG Report / Allure / Extent Report
 * 
 * Convert TestSuite into TestNG and Run from TestNG.xml File
 * Run Suite using Maven Clean and Maven Test
 * Add Utilities methods for click, Assertion, sendkeys etc
 * Create TC with Data Provider - Parametrization
 * Use Run Mode
 * 
 */

public class ProjectBaseClass {
	
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	@BeforeSuite
	public void setup()
	{
		if(driver==null)
		{
			try {
			config = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenToBeDeleted\\src\\test\\resources\\propertiesfile\\config.properties");
			config.load(fis);
			log.debug("Config file loaded");
			
			or = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenToBeDeleted\\src\\test\\resources\\propertiesfile\\or.properties");
			or.load(fis);
			log.debug("Or file loaded");
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Browser got loaded");
			}
			else if(config.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Browser got loaded");
			}
			
			driver.manage().window().maximize();
			log.debug("Browser got maximized");
			driver.get(config.getProperty("websiteurl"));
			log.debug("website got launched");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
			log.debug("Wait time added to driver");
			
			}catch(Exception e)
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
	
	
	

}
