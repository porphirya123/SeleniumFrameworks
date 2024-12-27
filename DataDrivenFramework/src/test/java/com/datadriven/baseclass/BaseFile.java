package com.datadriven.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.datadriven.utilities.CommonUtilities;

public class BaseFile {
	
	
	public static WebDriver driver;
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	
	
	
	
	@BeforeSuite
	public void initialSetup()
	{
		if(driver==null)
		{
			try 
			{
				config = new Properties();
				fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\objectRepository\\config.properties");
				config.load(fis);
				log.debug("Config file is loaded");
				
				or = new Properties();
				fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\objectRepository\\or.properties");
				or.load(fis);
				log.debug("OR file is loaded");
				
				if(config.getProperty("browser").contains("chrome"))
				{
					driver = new ChromeDriver();
					log.debug("Chrome driver initiated");
					
				}else if(config.getProperty("browser").contains("firefox"))
				{
					
					driver = new FirefoxDriver();
					log.debug("Fireforx driver initiated");
				}
				
			}catch(Exception e)
			{
				System.out.println("Something went wrong");
				
			}
				
			}
		
		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		log.debug("Website got launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.debug("Implicit wait got implemented for 10 seconds");
			
			
			
		}
		
	
	public void verifyEquals(String expected, String actual) throws IOException
	{
		
		try {
			
			Assert.assertEquals(expected, actual);
			
		}catch(Throwable t)
		{
			CommonUtilities.takePageScreenshot();
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			Reporter.log("<br>"+ "Verifiction Failed : "+t.getMessage()+""+"<br>");
			//Reporter.log("<a href="+ CommonUtilities.screenshotName +"target = \"_blank\">Screenshot</a>");
			Reporter.log("<a target =\"_blank\" href="+CommonUtilities.screenshotName+"><img src="+CommonUtilities.screenshotName+" height=200 width=200></img></a>");
			Reporter.log("<br>");
			
		}
		
	}
	
	
	public void click(String element)
	{
		driver.findElement(By.xpath(or.getProperty(element))).click();
		
			
	}
	
	
	public void sendValue(String element, String text)
	{
		
		driver.findElement(By.xpath(or.getProperty(element))).sendKeys(text);
		
		
	}
	
		
		
	//@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

	
	
	
		
	}
	


