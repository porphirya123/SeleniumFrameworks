package com.project.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.project.baseclass.BaseClass;

public class Utilities extends BaseClass{

	public static String screenShotPath;
	public static String screenshotname;
	public static String extentreportname;
	
	public static void takeScreenshot()
	{
		screenShotPath = "C:\\eclipse-workspace\\DataDrivenDecOneSeven\\src\\test\\resources\\screenshots";
		Date d = new Date();
		screenshotname = d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(screenShotPath+screenshotname));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
