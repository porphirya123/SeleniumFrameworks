package com.project.utilities;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	
	
	public static ExtentSparkReporter htmlreport;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	
	@BeforeTest
	public static void setReport()
	{
		htmlreport = new ExtentSparkReporter("C:\\eclipse-workspace\\ProjectDemo_20_11_2024\\src\\test\\resources\\reports\\extent.html");
		htmlreport.config().setEncoding("utf-8");
		htmlreport.config().setDocumentTitle("Project Sample ExtentReport");
		htmlreport.config().setReportName("Exent Report Status");
		
		
		
		
	}
	

}
