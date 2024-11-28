package com.practice.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseFile {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	FileInputStream fis;
	WebDriverWait wait;
	Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	public boolean isElementPresent(By by)
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
	
	
	
	@BeforeSuite
	public void setup()
	{
		
		if(driver == null)
		{
			try {
				fis = new FileInputStream("C:\\eclipse-workspace\\PracticeProject\\src\\test\\resources\\propertyfiles\\config.properties");
				log.debug("Config property file identified");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config property file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			try {
				fis = new FileInputStream("C:\\eclipse-workspace\\PracticeProject\\src\\test\\resources\\propertyfiles\\or.properties");
				log.debug("Or property file identified");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				or.load(fis);
				log.debug("Or property file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Browser launched");
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Browser loaded");
			}
								
		}
		
		driver.manage().window().maximize();
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched !!!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		
	}
	
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
