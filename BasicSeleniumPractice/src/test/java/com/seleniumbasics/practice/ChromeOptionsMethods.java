package com.seleniumbasics.practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMethods extends TakesScreenshotDemo{
	
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Duration duration = Duration.ofSeconds(5);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--ignore-certificate-errors");
		option.addArguments("--ignore-ssl-errors");
		
		
		option.setImplicitWaitTimeout(duration);
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY);
		
		
		driver.get("https://www.amazon.in");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takescreenshot(driver);
		
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		
		
		
		
		driver.quit();
		
	}

}
