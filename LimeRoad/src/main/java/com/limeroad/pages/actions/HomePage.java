package com.limeroad.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.limeroad.base.BasePage;
import com.limeroad.pages.locators.HomeLocators;

public class HomePage extends BasePage{

	
	HomeLocators homeLocators;
	
	public HomePage()
	{
		this.homeLocators = new HomeLocators();
		AjaxElementLocatorFactory fac = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(fac, this.homeLocators);
	}
	
	
	public void gotoAllProducts()
	{
	 action(driver, homeLocators.allProduct).moveToElement(homeLocators.jeans).build().perform();
	 
		
	}
	
	public void gotoNewIn()
	{
		action(driver,homeLocators.newIn).moveToElement(homeLocators.ling).build().perform();
		
	}
	
	public void gotoDresses()
	{
		
		action(driver,homeLocators.dress).perform();
	}
	
	public void gotoTops()
	{
		action(driver, homeLocators.tops).perform();
		
	}
}
