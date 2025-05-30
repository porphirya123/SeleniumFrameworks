package com.practice.baseFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
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
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger logger = Logger.getLogger("devpinoyLogger");
	//public static ExcelReader excel = new ExcelReader(System.getProperty("C:\\eclipse-workspace\\FrameWorkPractice\\src\\test\\resources\\TestData\\AddcustomerData.xlsx"));
	

	
	@BeforeSuite
	public void setup()
	{
		
		try {
			fis = new FileInputStream("C:\\eclipse-workspace\\FrameWorkPractice\\src\\test\\resources\\PropertiesFile\\config.properties");
			logger.debug("Config File locaton assigned");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
			logger.debug("Config File loaded !!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			fis = new FileInputStream("C:\\eclipse-workspace\\FrameWorkPractice\\src\\test\\resources\\PropertiesFile\\or.properties");
			logger.debug("Or File locaton assigned");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			or.load(fis);
			logger.debug("Config File loaded !!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(config.getProperty("browser").equals("chrome"))
		{
			driver= new ChromeDriver();
			logger.debug("Chrome launched !!");
			
		}
		else if(config.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
			logger.debug("Firefox launched !!");
		}

		driver.get(config.getProperty("websiteurl"));
		logger.debug("website url launched !!");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
		logger.debug("Browser closed!!");
	}
	
	

	/**************Common Methods **********************/
	
	public boolean isElementPresent(By by)
	{
		try {
			driver.findElement(by);
			return true;
		}catch (NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	
	
}
