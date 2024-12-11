package com.packageone;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AddScreenshotLink {
	
	WebDriver driver;
	
	public void addScreenshotLink()
	{
		Reporter.log("<a href=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg\" target = \"_blank\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg \"><img src=\"C:\\eclipse-workspace\\DataDrivenProjectSample1\\src\\test\\resources\\screenshots\\Mon_Dec_02_11_15_55_IST_2024.jpeg\" height=200 width=200></img></a>");
		Reporter.log("<br>");
		
		Reporter.log("<a href = \"path of the scrennshot using backslash\"  target = \"_blank\"> screenshotname </a>");
		

	}

}
