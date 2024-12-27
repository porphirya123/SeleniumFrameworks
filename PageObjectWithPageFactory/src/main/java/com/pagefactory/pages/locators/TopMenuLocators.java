package com.pagefactory.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuLocators {
	
	
	@FindBy(xpath = "//a[@id = 'women_category']")
	public WebElement Women;
	
	@FindBy(xpath = "(//a[contains(text(), 'sarees')])[2]")
	public WebElement sarees;
	
	@FindBy(xpath = "//a[@id = 'men_category']")
	public WebElement men;
	
	
	@FindBy(xpath = "//a[@id = 'kids_category']")
	public WebElement kids;
	
	@FindBy(xpath = "//a[@id = 'home_category']")
	public WebElement home;
	
	@FindBy(xpath = "//div[@id = 'newDeskOffers']")
	public WebElement offers;
	

	@FindBy(xpath = "//div[@id = 'newDeskVmart']")
	public WebElement vmarts;
	
}
