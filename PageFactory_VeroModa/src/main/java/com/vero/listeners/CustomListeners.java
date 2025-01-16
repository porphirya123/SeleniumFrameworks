package com.vero.listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.veromoda.utilities.Utilities;

import jdk.internal.org.jline.utils.Log;

public class CustomListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Passed");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		com.vero.utilities.Utilities.takesScreenshot();
		Reporter.log("<a href="+com.vero.utilities.Utilities.screenshotname+"target = \"_blank\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href="+com.vero.utilities.Utilities.screenshotname+"><img src="+com.vero.utilities.Utilities.screenshotname+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		Reporter.log("Clicked on Website Login");
		
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		com.vero.utilities.Utilities.takesScreenshot();
		Reporter.log("<a href="+com.vero.utilities.Utilities.screenshotname+"target = \"_blank\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href="+com.vero.utilities.Utilities.screenshotname+"><img src="+com.vero.utilities.Utilities.screenshotname+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		Reporter.log("Clicked on Website Login");
		//Reporter.log("<a href = \"C:\\eclipse-workspace\\DataDrivenProjectRefine\\src\\test\\resources\\screenshots\\screenshot.jpeg" target = \ "_blank\"><img src= \"C:\\screenshot\\error.jpeg\" > </a>);
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	
	
	
	

}
