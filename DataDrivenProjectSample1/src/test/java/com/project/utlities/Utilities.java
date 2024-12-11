package com.project.utlities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.project.baseclass.BaseClass;

public class Utilities extends BaseClass {

	public static String screenShotPath;
	public static String screenshotname;
	public static String extentreportname;
	
	public static void takesScreenshot()
	{
		Date d = new Date();
		screenshotname = d.toString().replace(" ", "_").replace(":","_")+ ".jpg";
		extentreportname = d.toString().replace(" ", "_").replace(":","_")+ ".html";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotname));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
