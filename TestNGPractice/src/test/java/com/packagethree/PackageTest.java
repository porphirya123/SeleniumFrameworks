package com.packagethree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PackageTest {
	
	WebDriver driver;

	@Test
	public void AnotherPackage()
	{
	
		System.out.println("Test Two");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
	
	
}
