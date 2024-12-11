package com.project.utlities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomExtentReports {
	
	public static ExtentSparkReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeSuite
	public void setReport()
	{
		
		htmlReport = new ExtentSparkReporter("Utilities.extentreportname");
		htmlReport.config().setEncoding("utf-8");
		htmlReport.config().setDocumentTitle("DataDriven Project Report");
		htmlReport.config().setReportName("Function Test Report");
		htmlReport.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		extent.setSystemInfo("Automation Framework Creator", "Santosh Kumar");
		extent.setSystemInfo("Suite Name", "Functional Suite");
		extent.setSystemInfo("Organization", "Automation Company");
	}
	
	
	
	
	
	@AfterSuite
	public void flush()
	{
		extent.flush();
	}
	
	
	

}
