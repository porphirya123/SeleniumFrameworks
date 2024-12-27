package com.veromoda.pageActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.veromoda.basePage.BasePage;
import com.veromoda.pageLocators.HomePageLocators;

public class HomePage extends BasePage {
	
	HomePageLocators homeLocators;
	
	public HomePage()
	{
		this.homeLocators = new HomePageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this.homeLocators);
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
