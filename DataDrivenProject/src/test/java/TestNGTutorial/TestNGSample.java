package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGSample {
	
	
	@BeforeMethod
	public void printBeforeMethod()
	{
		System.out.println("Printing Before Method");
	}
	
	@Test
	public void printname()
	{
		System.out.println("Prining Name");
	}
	


	
	@Test(dependsOnMethods="printPostal")
	public void printCountry()
	{
		System.out.println("Printing Country");
	}
	
	@Test(priority=1)
	public void printPostal()
	{
		System.out.println("Printing Postal Code");
		Assert.fail("Unable to print Postal Code");
	}
	
	
	
	@Test(priority= 1)
	public void printAddress()
	{
	System.out.println("Printing Address");	
	}
	
	@AfterMethod
	public void printAfterMethod()
	{
		String Expected = "Google.com";
		String Actual = "Yahoo.com";
		//Assert.assertEquals(Expected, Actual);
		System.out.println("Printing After Method");
	}
	
	
	

}
