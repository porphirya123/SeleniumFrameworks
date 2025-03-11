package com.veromoda.basepage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.veromoda.pagesActions.TopNavigationAction;

public class BasePage {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static TopNavigationAction topmenu;
	
	public static void setup()
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
		driver.get(Constants.url);
		topmenu = new TopNavigationAction(driver);
	}
	
	public static void teardown()
	{
		driver.quit();
	}
	
	
	public static Actions action(WebDriver driver, WebElement webElement)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(webElement);
		return act;
		
	}
	
	public static void takeScreenshot(WebDriver driver)
	{
		Date d = new Date();
		String filename = d.toString().replaceAll(" ", "_").replace(":", "_")+".jpeg";
		File path = new File("C:\\eclipse-workspace\\VeroModaPageObjectModelPageFactory\\src\\test\\resources\\screenshots\\"+filename);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
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
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void send(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}
	

}
