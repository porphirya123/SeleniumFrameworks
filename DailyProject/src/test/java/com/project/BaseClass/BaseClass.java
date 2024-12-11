package com.project.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
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
	public static WebDriverWait wait;
	Logger log = Logger.getLogger("devpinoyLogger");
	
	
	@BeforeSuite
	public void setup()
	{
		
		if(driver==null)
		{
			try {
			config = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DailyProject\\src\\test\\resources\\propertyfiles\\config.properties");
			config.load(fis);
			
			or = new Properties();
			fis = new FileInputStream("C:\\eclipse-workspace\\DailyProject\\src\\test\\resources\\propertyfiles\\or.properties");
			or.load(fis);
			
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver = new FirefoxDriver();
			}
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		
			
	}
	
	


	
	
	@AfterSuite
	public void teardown()
	{
		if(driver!=null)
		driver.quit();
	}

	
	
	
	
	
	

}


