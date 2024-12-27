package com.limeroad.testcases;

import com.limeroad.base.BasePage;
import com.limeroad.pages.actions.HomePage;

public class SampleTestCase {

	
	public static void main(String[] args) {
		
		BasePage.config();
		HomePage hm = new HomePage();
		hm.gotoAllProducts();
		hm.gotoDresses();
		hm.gotoNewIn();
		hm.gotoTops();
		BasePage.teardown();
		
		
		
	}
	
	
}
