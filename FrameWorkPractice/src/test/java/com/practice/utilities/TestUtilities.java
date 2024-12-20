package com.practice.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.practice.baseFile.BaseFile;

public class TestUtilities extends BaseFile{
	
	public static String screenShotPath;
	public static String screenshotName;
	
	public static void takesScreenshot()
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			screenshotName = TestUtilities.getScreenshotName();
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static String getScreenshotName()
	{
		Date d = new Date();
		String screenshotname =d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		return screenshotname;
	}

}
