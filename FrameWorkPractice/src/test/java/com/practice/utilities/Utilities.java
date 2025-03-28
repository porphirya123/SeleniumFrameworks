package com.practice.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public void getScreenshot(WebDriver driver)
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

}
