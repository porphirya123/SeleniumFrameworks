package com.refineproject.baseclass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ProjectBaseClass {

	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	@BeforeSuite
	public void configSetup()
	{
		if(driver==null)
		{
			try
			{
			config=new Properties();
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\config.properties");
			config.load(fis);
			log.debug("Config file loaded successfully");
			
			or = new Properties();
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertyfiles\\or.properties");
			or.load(fis);
			log.debug("OR file loaded successfully");
			}catch(Exception e)
			{
				System.out.println("Problem with reading property file");
			}
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				log.debug("Chrome Launched!!");
				
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
				log.debug("Firefox Launched!!");
			}
				
		}
		
		driver.manage().window().maximize();
		driver.get(config.getProperty("websiteurl"));
		log.debug("Website Launched!!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
