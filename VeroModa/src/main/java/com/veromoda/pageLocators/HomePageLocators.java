package com.veromoda.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath = "(//*[contains(text(), 'All products')])[1]")
	public WebElement allProduct;
	
	@FindBy(xpath = "//a[contains(text(), 'JEANS')]")
	public WebElement jeans;
	
	@FindBy(xpath = "//*[contains(text(), 'NEW IN')]")
	public WebElement newIn;
	
	@FindBy(xpath = "(//a[contains(text(), 'Lingerie')])[1]")
	public WebElement ling;
	
	@FindBy(xpath = "(//*[contains(text(), 'DRESSES')])[1]")
	public WebElement dress;
	
	@FindBy(xpath = "(//a[contains(text(), 'Midi')])[1]")
	public WebElement mini;
	
	@FindBy(xpath = "(//*[contains(text(), 'TOPS')])[1]")
	public WebElement tops;
	
	@FindBy(xpath = "(//*[contains(text(), 'Shirts')])[1]")
	public WebElement shirts;
	
}
