package com.practice.rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider ="test")
	public void login(String username, String password)
	{
		System.out.print("Print Data Provider value" + username+ " : "+password);
	}
	
	
	@DataProvider(name = "test")
	public Object[][] getData()
	{
		Object[][] data = 	{
								{"test@test.in", "Santosh"},
								{"test@test.in", "Santosh"},
								{"test@test.in", "Santosh"}
				
							};
		
		return data;
		
		
		}
		
		
		
	}


	
	
	
	




