package com.veromoda.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesLocators.HomePageLocators;

public class HomePageAction extends BasePage{
	
	HomePageLocators hmlocators;
	
	public HomePageAction()
	{
		this.hmlocators = new HomePageLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this.hmlocators);
	}
	
	public void gotoAllProducts()
	{
	 action(driver, hmlocators.allProducts).moveToElement(hmlocators.jeans).build().perform();
	 
		
	}
	
	
	public void gotoNewIn()
	{
		action(driver,hmlocators.allProducts).moveToElement(hmlocators.jeans).build().perform();
		//BasePage.takeScreenshot(driver);
	}
	
	public void gotoDresses()
	{
		
		action(driver,hmlocators.dress).perform();
	}
	
	public void gotoTops()
	{
		action(driver, hmlocators.tops).perform();
		
	}

}
