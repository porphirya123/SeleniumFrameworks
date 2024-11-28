package com.projectBaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ProjectBaseClass {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	@BeforeSuite
	public void setup()
	{
		if(driver==null)
		{
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFiles\\config.properties");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
			log.debug("config file loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFiles\\or.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			or.load(fis);
			log.debug("or file loaded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(config.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
			log.debug("Chrome driver launched successfully");
			
		}
		else if(config.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("Firefox driver launched successfully");
			
		}
		
		driver.manage().window().maximize();
		log.debug("Browser got maximized successfully");
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
		
		
		
	}
	
	/*******Custom Method to Check Assertion condition********/
	public static boolean isElementPresent(By by)
	{
		try {
		driver.findElement(by);
		return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	/******************************************************/

	

	/*******Custom Method to take Screenshot with custom file name********/
	public static void getScreenshot()
	{
		
		Date d = new Date();
		
		
		String screenshotName = "";
		screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\ProjectDemo_19_11_2024\\src\\test\\resources\\screenShots\\screenshot"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/******************************************************/

	
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
