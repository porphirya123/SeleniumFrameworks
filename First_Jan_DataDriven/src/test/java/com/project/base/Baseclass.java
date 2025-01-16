package com.project.base;

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

public class Baseclass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	

	@BeforeSuite
	public void config()
	{

		if(driver==null)
		{
			try {
				config = new Properties();
				fis = new FileInputStream("C:\\eclipse-workspace\\First_Jan_DataDriven\\src\\test\\resources\\properties\\config.properties");
				config.load(fis);
				log.debug("config file loaded");
		
				or = new Properties();
				fis = new FileInputStream("C:\\eclipse-workspace\\First_Jan_DataDriven\\src\\test\\resources\\properties\\or.properties");
				or.load(fis);
				log.debug("or property file loaded success");
				}catch(Exception e)
				{
				System.out.println(e.getMessage());	
				}
				if(config.getProperty("browser").equalsIgnoreCase("chrome"))
				{
					driver = new ChromeDriver();
					log.debug("Chrome Browser launched");
				}else if(config.getProperty("browser").equalsIgnoreCase("firefor"))
				{
					driver = new FirefoxDriver();
					log.debug("Firefox Browser launched");		
				}
			
		}
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website launched");
		driver.manage().window().maximize();
		log.debug("Window got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.debug("Implicit wait added");
		
	}
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
		log.debug("Browser got closed");
	}
	
	

}
