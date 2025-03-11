package com.project.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.project.basepackage.BaseClass;



public class CommonUtilities extends BaseClass {
	
	
	
	
	public static void takescreenshot()
	{
		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\DataDrivenApporachFramework\\src\\test\\resources\\screenshots"+filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	

}
