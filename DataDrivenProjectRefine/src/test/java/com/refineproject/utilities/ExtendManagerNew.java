package com.refineproject.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.DisplayOrder;

public class ExtendManagerNew {

	private static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent ==null)
		{
			try
			{
				
			
			ExtentSparkReporter htmlreport = new ExtentSparkReporter("C:\\eclipse-workspace\\DataDrivenProjectRefine\\src\\test\\resources\\ExtendReports\\extentreport.html");
			htmlreport.loadJSONConfig("C:\\eclipse-workspace\\DataDrivenProjectRefine\\src\\test\\resources\\ReportsConfig.xml");
			
			
			}catch(Exception e)
			{
				
			}
			
		}
		return extent;
		
	}
	
}
