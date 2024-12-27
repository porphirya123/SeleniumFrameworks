package com.datadriven.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.datadriven.baseclass.BaseFile;



public class CommonUtilities extends BaseFile{
	
	public static String screenshotName;
	public static String screenshotPath;
	
	
	public static boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	
	
	public static void handleAlert()
	{
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
				
	}
	
	
	public static void takePageScreenshot()
	{
		Date d = new Date();
		
		screenshotName = (d.toString().replace(":", "_").replace(" ", "_") + ".jpeg");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
	}

	
	
	
	
}
