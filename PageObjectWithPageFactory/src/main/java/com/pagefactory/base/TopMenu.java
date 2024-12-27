package com.pagefactory.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pagefactory.pages.locators.TopMenuLocators;

public class TopMenu extends Page{
	
	TopMenuLocators topmenulocator;
	
	
	public TopMenu()
	{
		this.topmenulocator = new TopMenuLocators();
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajax, this.topmenulocator);
	}
	
	

	
	
	public void goToWomenSection()
	{
		
		act.moveToElement(topmenulocator.Women).moveToElement(topmenulocator.sarees).click().perform();
		
	}
	
	
	public void goToMenSection()
	{
		topmenulocator.men.click();
	}
	
	
	public void goToKidsSection()
	{
		topmenulocator.kids.click();
		
	}
	
	
	public void goToHome()
	{
		
	}
	
	public void goToVmart()
	{
		
		
	}

}
