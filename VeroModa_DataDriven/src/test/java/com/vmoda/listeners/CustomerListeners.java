package com.vmoda.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.vmoda.base.BaseClass;
import com.vmoda.utilities.Utilities;

public class CustomerListeners extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Utilities.takesScreenshot();
		Reporter.log("<a href="+Utilities.screenshotname+"target = \"_blank\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href="+Utilities.screenshotname+"><img src="+Utilities.screenshotname+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		Reporter.log("Clicked on Website Login");
		
		
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Utilities.takesScreenshot();
		Reporter.log("<a href="+Utilities.screenshotname+"target = \"_blank\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href="+Utilities.screenshotname+"><img src="+Utilities.screenshotname+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		Reporter.log("Clicked on Website Login");
		
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}
	
	
	
	
	

}
