package com.project.rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.project.base.Page;
import com.project.pages.actions.HomePage;

public class Customer {
	
	
	public static void main(String[] args) {
		
		
		
		Page.initConfiguration();
		HomePage homepage = new HomePage();
		homepage.goToBankManager().addBankManager("Santosh", "Kumar", "234234");
		Page.quitBrowser();
		
		
	}

}
