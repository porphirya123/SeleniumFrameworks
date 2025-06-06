package com.project.BaseClass;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	

	
	
	@BeforeSuite
	public static void setup()
	{
		
	
	if(driver==null)
	{
		try {
			
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\config.properties");
			config.load(fis);
			log.debug("config file loaded successfully");
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyFile\\or.properties");
			or.load(fis);
			log.debug("config file loaded successfully");
			Reporter.log("File Loaded successfully");
		}catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		
	}
	if(config.getProperty("browser").equals("chrome"))
	{
		driver= new ChromeDriver();
		log.debug("Chrome loaded successfully");
	}
	else if(config.getProperty("browser").equals("firefox"))
	{
		driver = new FirefoxDriver();
		log.debug("Firefox loaded successfully");
	}
	
	driver.manage().window().maximize();
	log.debug("Window got maximized successfully");
	driver.get(config.getProperty("websiteurl"));
	log.debug("website loaded successfully");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
	}
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	public static void screenshot()
	{
		
		Date d = new Date();
		
		String screenshotName = "";
		
		screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\ProjectDemo_20_11_2024\\src\\test\\resources\\screenshots\\"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public boolean isElementAvailable(By by)
	{
		try {
		driver.findElement(by);
		return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	
	
	
	
	

}
