package com.practice.rough;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Action;

import com.project.baseclass.BaseClass;

public class CheckSeleniumInterfaces extends BaseClass{

	
	
	public static void main(String[] args) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		Alert alert = (Alert)driver;
		Action act = (Action)driver;
		
		
		
		
	}
	

}
