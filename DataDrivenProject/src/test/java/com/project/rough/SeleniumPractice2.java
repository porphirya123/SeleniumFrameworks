package com.project.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {
	
	
	//static WebDriver driver=new ChromeDriver();	
	
	public void setup()
	{
		System.out.println(System.getProperty("user.dir"));
	}

	public static void main(String[] args) {

		SeleniumPractice2 obj = new SeleniumPractice2();
		obj.setup();
		
	}

}
