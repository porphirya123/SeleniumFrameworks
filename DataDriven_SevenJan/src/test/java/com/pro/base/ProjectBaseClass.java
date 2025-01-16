package com.pro.base;

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
 * Add 2nd TC with DataProvider - DONE
 * Configure Listeners - Partial DONE
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
	
	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");	
	
	
	
	@BeforeSuite
	public static void setup()
	{
		if(driver == null)
		{
			try {
			config = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			log.debug("Config file loaded");
			
			or = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\properties\\or.properties");
			or.load(fis);
			log.debug("Or file loaded");
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Driver loaded");
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Driver loaded");
			}
		
						
			}catch(Exception e)
			{
				System.out.println(e.getStackTrace());
			}
				
		}		
		
		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.debug("Implicit Wait got added");
		
		
	}
	
	
	
	@AfterSuite
	public static void teardown()
	{
		driver.quit();
	}
	

}
