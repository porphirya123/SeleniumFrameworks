package com.vero.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(xpath = "//input[@name = 'search']")
	public WebElement search;
	
	@FindBy(xpath = "//a[@title= 'My Account']")
	public WebElement myAccount;
	
	@FindBy(xpath = "//a[@title= 'My Wish List']")
	public WebElement myWishList;
	
	@FindBy(xpath = "//button[@title= 'Cart']")
	public WebElement cart;

}
