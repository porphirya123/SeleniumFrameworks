package com.veromoda.pagesActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesLocators.TopNavigationLocators;

public class TopNavigationAction extends BasePage {
	
	TopNavigationLocators topNav;
	
	public TopNavigationAction(WebDriver driver)
	{
		this.topNav = new TopNavigationLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(ajax, this.topNav);
	}
	
	public void gotoSearch()
	{
		BasePage.send(topNav.search, "Hello");
	}
	
	public void gotoMyAccount()
	{
		BasePage.click(topNav.myAccount);
	}
	
	public void gotoFavourites()
	{
		BasePage.click(topNav.myWishList);
	}
	
	public CartAction gotoCart()
	{
		BasePage.click(topNav.cart);
		return new CartAction();
		
	}
	
	
	
	

}
