package com.vero.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.vero.page.BasePage;
import com.vero.pages.locators.HomePageLocators;

public class HomePage extends BasePage{
	
	HomePageLocators homeLocator;
	
	public HomePage()
	{
		this.homeLocator = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homeLocator);
		
	}
	
	public void gotoAllProducts()
	{
	 moveToElement(driver, homeLocator.allProduct).moveToElement(homeLocator.jeans).build().perform();
	 
		
	}
	
	public void gotoNewIn()
	{
		moveToElement(driver,homeLocator.newIn).moveToElement(homeLocator.ling).build().perform();
		
	}
	
	public void gotoDresses()
	{
		
		moveToElement(driver,homeLocator.dress).perform();
	}
	
	public void gotoTops()
	{
		moveToElement(driver, homeLocator.tops).perform();
		
	}
	
	
	
	

}
