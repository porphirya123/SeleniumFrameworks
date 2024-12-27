package com.pagefactory.base;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.pagefactory.pages.locators.TopMenuLocators;

public class Page {
	
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static TopMenu topmenu;
	public static Actions act=new Actions(driver);
	
	
	
	
	
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
			
		}else if(Constants.browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		
		topmenu = new TopMenu();
		
	}
	
	
	public static void handleAlerts()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	
	
	public static void teardown()
	{
		driver.quit();
	}
	
	

}
