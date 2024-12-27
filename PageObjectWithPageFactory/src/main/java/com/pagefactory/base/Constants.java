package com.pagefactory.base;

public class Constants {

	public static final String browser = "chrome";
	public static final String webSiteUrl = "https://www.limeroad.com/";
	
	
	public static final String home = "//button[contains(text(),'Home')]";
	public static final String customerLogin = "//button[contains(text(),'Customer Login')]";
	public static final String bankManagerLogin = "//button[contains(text(), \"Bank Manager Login\")]";
	public static final String addCustomer = "//button[contains(text(), 'Add Customer')]";
	public static final String firstName = "//input[contains(@placeholder, 'First Name')]";
	public static final String lastName = "//input[contains(@placeholder, 'Last Name')]";
	public static final String postCode = "//input[contains(@placeholder, 'Post Code')]";
	public static final String addCustomerbutton = "(//button[contains(text(), 'Add Customer')])[2]";
	public static final String openAccountTab = "//button[contains(text(), 'Open Account')]";
	public static final String customerDropdown = "//select[@id=\"userSelect\"]";
	public static final String currencyDropdown = "//select[@id=\"currency\"]";
	public static final String processButton = "//button[contains(@type, 'submit')]";
	public static final String customersTab = "//button[contains(text(), 'Customers')]";
	public static final String deleteButton = "(//button[contains(text(), 'Delete')])[1]";
	
	public static final String Women = "//a[@id = 'women_category']"; 
	public static final String men = "//a[@id = 'men_category']"; 
	public static final String kids = "//a[@id = 'kids_category']"; 
	public static final String homelink = "//a[@id = 'home_category']"; 
	public static final String offers = "//div[@id = 'newDeskOffers']"; 
	public static final String vmarts = "//div[@id = 'newDeskVmart']"; 
	
	
}
