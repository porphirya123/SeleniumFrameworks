package com.veromoda.basePage;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.veromoda.pageActions.TopNavigation;



public class BasePage {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static TopNavigation topnav;
	
	
	public static void config()
	{
		
				
		if(Constants.browser.contains("chrome"))
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
					
		}else if(Constants.browser.contains("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("Firefox webdriver has been configured and launched");
		}
		
		driver.manage().window().maximize();
		log.debug("Browser maximized");
		driver.get(Constants.url);
		topnav = new TopNavigation(driver);
		
	}
	

	public static Actions action(WebDriver driver, WebElement webElement)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(webElement);
		return act;
		
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
	
	
	public static void teardown()
	{
		driver.quit();
	}
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void sendText(WebElement ele, String txt)
	{
		ele.sendKeys(txt);
	}
	
	
}
