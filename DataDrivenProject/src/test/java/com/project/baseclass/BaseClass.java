package com.project.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	
	
	
		
	@BeforeSuite
	public void setup()
	{
		
		if(driver==null)
		{
			try {
				fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProjectPractice\\src\\test\\resources\\propertyFile\\config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProjectPractice\\src\\test\\resources\\propertyFile\\or.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				or.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(config.getProperty("browser").equals("chrome"))
			{
				driver = new ChromeDriver();
				
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			
			

		}
		driver.manage().window().maximize();
		driver.get(config.getProperty("websiteurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
}


