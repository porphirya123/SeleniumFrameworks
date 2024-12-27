package com.veromoda.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Reporter;

import com.veromoda.basePage.BasePage;
import com.veromoda.errorcollector.ErrorCollector;
import com.veromoda.pageLocators.CartLocators;

public class Cart extends BasePage{
	
	
	CartLocators cartLoc;
	
	public Cart()
	{
		
		this.cartLoc = new CartLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.cartLoc);
		
	}
	
	
	public void gotoContactUs()
	{
		click(cartLoc.contactUs);
		ErrorCollector.verifyEquals(34, 43);
		Reporter.log("Test verification added");
		
		
	}
	
	
	public void gotoFindAStore()
	{
		
		
		click(cartLoc.findaStore);
		
	}
	
	public void gotoFAQ()
	{
		
		click(cartLoc.faq);
	}
	

}
