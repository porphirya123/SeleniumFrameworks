package com.project.rough;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {
	
	static WebDriver driver=new ChromeDriver();
	
	
	public void setup()
	{
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot screen1 = (TakesScreenshot)driver;
		File file2 = screen1.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file2, new File("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\screenshots\\1stScreen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement custLogin = driver.findElement(By.xpath("//button[contains(text(),'Customer')]"));
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(custLogin));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
			
		wait.until(ExpectedConditions.elementToBeClickable(custLogin));
		
		
		
		
		
		
		custLogin.click();
		
		TakesScreenshot screen2 = (TakesScreenshot)driver;
		File file = screen2.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\screenshots\\test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		;
	}
	
	//***************** Method to handle windows  ****************
	
	
	public static void windowHandles()
	{
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
		driver.switchTo().window(window);
		String winTitle = driver.getTitle();
			if(winTitle=="Google")
			{
				driver.findElement(By.xpath("//a"));
				driver.quit();
			}
		}
	}
	
	

	//***************** Method for Action Class  ****************
	
	
	
	
	public void quit()
	{
		driver.quit();
	}
	
	

	public static void main(String[] args) {
		
		
		SeleniumPractice obj = new SeleniumPractice();
		obj.setup();
		obj.quit();
		

	}

}
