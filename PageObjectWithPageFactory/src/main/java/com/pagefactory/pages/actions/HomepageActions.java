package com.pagefactory.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pagefactory.base.Page;
import com.pagefactory.pages.locators.HomePageLocators;

public class HomepageActions extends Page{
	
	
	public HomePageLocators hmLocators;
	
	public HomepageActions()
	{
		this.hmLocators = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.hmLocators);
	}
	
	
	
	public void clickOnHome()
	{
		hmLocators.home.click();
	}
	
	
	public void customerLogin()
	{
		hmLocators.customerLogin.click();
	}
	
	
	public void bankManagerLogin()
	{
		hmLocators.bankManagerLogin.click();
	}
	
	
	public void AddBankManager()
	{
		hmLocators.addCustomer.click();
		hmLocators.firstName.sendKeys("Santosh");
		hmLocators.lastName.sendKeys("Kumar");
		hmLocators.postCode.sendKeys("12222");
		hmLocators.submit.click();
		handleAlerts();
		
		
	}
	
	
	

}
