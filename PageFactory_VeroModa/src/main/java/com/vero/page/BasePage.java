package com.vero.page;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static TopNavigation topnav;
	
	
	public static void setup()
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
			driver.manage().window().maximize();
			log.debug("Browser maximized");
			
		}else if(Constants.browser.contains("firefox"))
		{
			driver = new FirefoxDriver();
			log.debug("Firefox got launched");
			driver.manage().window().maximize();
		}
		
		driver.get(Constants.url);
		log.debug("Url launched");
		topnav = new TopNavigation(driver);
		
		
	}
	
	public static void click(WebElement ele)
	{
		ele.click();
		log.debug("Click action got performed");
	}
	
	public static void sendText(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}
	
	public static Actions moveToElement(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		return act;
	}
	
	
	
	
	
	public static void exit()
	{
		
		if(driver!=null)
		{
			driver.quit();
			log.debug("browser quit");
		}
		
	}
	
}
