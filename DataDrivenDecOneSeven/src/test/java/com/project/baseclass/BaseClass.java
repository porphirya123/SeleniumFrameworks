package com.project.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
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
	//public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	
	
	@BeforeSuite
	public void browserConfig()
	{
		
		if(driver==null)
		{
			try
			{
			config = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenDecOneSeven\\src\\test\\resources\\propertyfiles\\config.properties");
			config.load(fis);
			log.debug("Config loaded successfully");
			log.info("File Loaded successfully");
			
			or = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenDecOneSeven\\src\\test\\resources\\propertyfiles\\or.properties");
			or.load(fis);
			log.debug("OR loaded successfully");
		
			
			}catch(Exception e)
			{
				System.out.println("Desired file is not available on location");
			}
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Browser initialised");
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Browser initialised");
			}
			
			
			
			
		}
		
		

		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		log.debug("Implicit Wait added for 10 secs");
	}
	
	
	//@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	

}
