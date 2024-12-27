package com.pagefactory.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath ="//button[contains(text(),'Home')]")
	public static WebElement home;
	
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	public WebElement customerLogin;
	
	@FindBy(xpath = "//button[contains(text(), \"Bank Manager Login\")]")
	public WebElement bankManagerLogin;
	
	@FindBy(xpath = "//button[contains(text(), 'Add Customer')]")
	public WebElement addCustomer;
	
	@FindBy(xpath = "//input[contains(@placeholder, 'First Name')]")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[contains(@placeholder, 'Last Name')]")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[contains(@placeholder, 'Post Code')]")
	public WebElement postCode;
	
	@FindBy(xpath = "(//button[contains(text(), 'Add Customer')])[2]")
	public WebElement submit;
	
	
	
	
}
