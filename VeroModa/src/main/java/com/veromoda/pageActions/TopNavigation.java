package com.veromoda.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.internal.BaseClassFinder;

import com.veromoda.basePage.BasePage;
import com.veromoda.pageLocators.HomePageLocators;
import com.veromoda.pageLocators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topnavLoc;
	
	public TopNavigation(WebDriver driver)
	{
		
		this.topnavLoc = new TopNavigationLocators();
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(aj, this.topnavLoc);
			
	}
	
	
	
	
	public void gotoSearch()
	{
		BasePage.sendText(topnavLoc.search, "Hello");
	}
	
	public void gotoMyAccount()
	{
		BasePage.click(topnavLoc.myAccount);
	}
	
	public void gotoFavourites()
	{
		BasePage.click(topnavLoc.myWishList);
	}
	
	public Cart gotoCart()
	{
		BasePage.click(topnavLoc.cart);
		return new Cart();
		
	}
	
	
	

}
