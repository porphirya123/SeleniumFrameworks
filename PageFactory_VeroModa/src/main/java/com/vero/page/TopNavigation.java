package com.vero.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.vero.pages.actions.Cart;
import com.vero.pages.locators.TopNavigationLocators;


public class TopNavigation {
	
	TopNavigationLocators topNavlocator;
	
	public TopNavigation(WebDriver driver)
	{
		this.topNavlocator = new TopNavigationLocators();
		AjaxElementLocatorFactory factor = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factor, this.topNavlocator);
		
		
		
	}
	
	public void gotoSearch()
	{
		BasePage.sendText(topNavlocator.search, "Hello");
	}
	
	public void gotoMyAccount()
	{
		BasePage.click(topNavlocator.myAccount);
	}
	
	public void gotoFavourites()
	{
		BasePage.click(topNavlocator.myWishList);
	}
	
	public Cart gotoCart()
	{
		BasePage.click(topNavlocator.cart);
		return new Cart();
		
	}
	
	
	

}
