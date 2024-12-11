package com.project.pages.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.project.base.Page;
import com.project.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators homepageLocator;
	
	public HomePage()
	{
		this.homepageLocator = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homepageLocator);
	}
	

	
	
	public void goToCustomer()
	{
		homepageLocator.customerLogin.click();
		
	}
	
	
	public HomePage goToBankManager()
	{
		homepageLocator.bankManagerLogin.click();
		return this;
	}

	
	public void addBankManager(String fName, String lName, String pCode)
	{
		homepageLocator.addCustomer.click();
		homepageLocator.firstName.sendKeys(fName);
		homepageLocator.lastName.sendKeys(lName);
		homepageLocator.postCode.sendKeys(pCode);
		homepageLocator.submit.click();
	}
	

}
