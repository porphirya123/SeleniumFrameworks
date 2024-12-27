package com.veromoda.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.veromoda.basePage.BasePage;

public class Utilities extends BasePage {

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
