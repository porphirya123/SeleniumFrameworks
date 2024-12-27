package com.veromoda.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartLocators {
	
	
	@FindBy(xpath = "//a[contains(text(), ' Contact Us ')]")
	public WebElement contactUs;
	
	@FindBy(xpath = "//a[contains(text(), ' FAQ')]")
	public WebElement faq;
	
	@FindBy(xpath = "//a[contains(text(), ' Find a Store')]")
	public WebElement findaStore;
	
	
	
	
	

}
