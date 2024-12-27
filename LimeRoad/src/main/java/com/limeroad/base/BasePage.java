package com.limeroad.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {
	
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	Actions act = new Actions(driver);
	
	
	public static void config()
	{
		
		if(Constants.browser.equalsIgnoreCase("chrome"))
		{
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver();
			log.debug("Chrome Browser launched");
			
		} else if(Constants.browser.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(Constants.url);
		AjaxElementLocatorFactory locator = new AjaxElementLocatorFactory(driver, 10);
		
		
	}
	
	
	public static void winHandles(String title)
	{
		Set<String> windows = driver.getWindowHandles();
		for(String win: windows)
		{
			String newWin = driver.getWindowHandle();
			if(newWin.equals(title))
			{
				driver.switchTo().window(newWin);
				
			}
			
		
			
			
		}
	}
	
	
	
	public static Actions action(WebDriver driver, WebElement webElement)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(webElement);
		return act;
		
	}
	 
	
	public static void teardown()
	{
		driver.quit();
	}
	

}
