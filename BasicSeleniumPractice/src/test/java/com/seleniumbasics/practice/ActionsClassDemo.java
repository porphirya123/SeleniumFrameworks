package com.seleniumbasics.practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement bankmanagerLogin = driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(bankmanagerLogin).click().perform();
		//act.click(bankmanagerLogin).perform();

		
		
		
		
		
	}

}
