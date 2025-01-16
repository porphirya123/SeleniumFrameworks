package com.vero.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import com.vero.page.BasePage;
import com.vero.pages.locators.CartLocators;

public class Cart extends BasePage {

	CartLocators cartlocator;
	
	public Cart()
	{
		this.cartlocator = new CartLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.cartlocator);	
		
	}
	
	
	public void gotoContactUs()
	{
		click(cartlocator.contactUs);
		//ErrorCollector.verifyEquals(34, 43);
		Reporter.log("Test verification added");
		
		
	}
	
	
	public void gotoFindAStore()
	{
		
		
		click(cartlocator.findaStore);
		
	}
	
	public void gotoFAQ()
	{
		
		click(cartlocator.faq);
	}
	
	
}
