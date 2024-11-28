package com.projectUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.projectBaseClass.ProjectBaseClass;

public class Utilities extends ProjectBaseClass{
	
	public static String screenShotPath;
	public static String screenshotName = "test.jpeg";
	
	public static void getScreenshot()
	{
		
		Date d = new Date();
		
		
		String screenshotName = "";
		screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\ProjectDemo_19_11_2024\\src\\test\\resources\\screenShots\\screenshot"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean isElementPresent(By by)
	{
		try {
		driver.findElement(by);
		return true;
		}catch(NoSuchElementException e)
		{
			return false;
		}
	}

}
