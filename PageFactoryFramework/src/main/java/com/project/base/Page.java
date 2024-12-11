package com.project.base;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public static String browser;
	
	
	public static void initConfiguration()
	{
		
		if(Constants.browser.equals("chrome"))
		{
			
			
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			log.debug("Launching Chrome browser");
			
			
		}else if(Constants.browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("Lauching Firefox Browser");
		}
		
		driver.get(Constants.webSiteurl);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	

}
