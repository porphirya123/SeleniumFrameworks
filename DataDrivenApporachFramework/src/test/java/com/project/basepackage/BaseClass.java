package com.project.basepackage;

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



/* Initializing variables
 * Setup configuration and teardown methods
 * Create Tcs
 * Configure Logs
 * Convert to TestNG 
 * Configure Listener in Testng.xml
 * 
 * Configure Allure or Extent Report
 * Configuration of SureFire Plugin in pom.xml
 * 
 * 
 * 
 * 
 */

public class BaseClass {
	
	public static Properties config;
	public static Properties or;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	public static WebDriverWait wait;
	public static String configPath = "C:\\eclipse-workspace\\DataDrivenApporachFramework\\src\\test\\resources\\properties\\config.properties";
	public static String orPath = "C:\\eclipse-workspace\\DataDrivenApporachFramework\\src\\test\\resources\\properties\\or.properties";
	
	
	@BeforeSuite
	public static void config()
	{
		
		if(driver == null)
		{
			try
			{
				config = new Properties();
				fis = new FileInputStream(configPath);
				config.load(fis);
				log.debug("config property file loaded");
				or = new Properties();
				fis = new FileInputStream(orPath);
				or.load(fis);
				log.debug("or property file loaded");
				if(config.getProperty("browser").equalsIgnoreCase("chrome"))
				{
					driver = new ChromeDriver();
					log.debug("Chrome Browser launched");
					
				}
				else if(config.getProperty("browser").equalsIgnoreCase("firefox"))
				{
					driver = new FirefoxDriver();
					log.debug("Firefox Browser launched");
				}
				
				driver.manage().window().maximize();
				log.debug("Browser got maximized");
				driver.get(config.getProperty("websiteurl"));
				log.debug("Url got launched");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				log.debug("Standard implicit wait got added");
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
	}
	
	@AfterSuite
	public static void teardown()
	{
		driver.quit();
		log.debug("Browser got closed");
	}
	

}
