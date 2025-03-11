package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@BeforeAll
	public static void before_All()
	{
		System.out.println("@BeforeAll - DB Connection setup");
	}
	
	@AfterAll
	public static void after_All()
	{
		System.out.println("@Afterall - DB Connection closed");
	}
	
	
	@Before
	public void setup()
	{
		System.out.println("@Before --Browser Launch");
	}
	
	@After
	public void teardown()
	{
		System.out.println("@After -- Browser closed");
	}
	
	

}
