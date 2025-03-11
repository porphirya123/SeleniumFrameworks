package com.veromoda.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import com.veromoda.basepage.BasePage;
import com.veromoda.pagesLocators.CartLocators;

public class CartAction extends BasePage{
	
	CartLocators cart;
	
	public CartAction()
	{
		this.cart = new CartLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this.cart);
		
	}
	
	public void gotoContactUs()
	{
		click(cart.contactUs);
		Reporter.log("Test verification added");
			
	}
	
	
	public void gotoFindAStore()
	{
		
		click(cart.findaStore);
		
	}
	
	public void gotoFAQ()
	{
		
		click(cart.faq);
	}
	

}
