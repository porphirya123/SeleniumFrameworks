package com.demo.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demo.basepackage.ProjectBaseClass;

public class CustomUtilities extends ProjectBaseClass{
	
	
	public static void takeScreenshot()
	{
		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\eclipse-workspace\\DataDrivenToBeDeleted\\src\\test\\resources\\screenshots"+filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
