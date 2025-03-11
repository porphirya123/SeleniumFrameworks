package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("I am on facebook Login Screen")
	public void I_am_on_facebook_Login_Screen()
	{
		
		System.out.println("Test1");
		
	}
	
	@And("I can validate that Login Screen")
	public void I_can_validate_that_Login_Screen()
	{
		
		System.out.println("Test2");
		
	}
	
	@When("I provide {string} User id")
	public void I_provide_valid_User_id(String userid)
	{
		System.out.println("Test3 " +userid);
	}
	
	@And("I provide {string} password")
	public void I_provide_valid_password(String password)
	{
		System.out.println("Test4 "+password);
	}
	
	@And("I click on Login butoon")
	public void I_click_on_Login_butoon()
	{
		
		System.out.println("Test5");
	}
	
	@Then("I am navigated to Facebook HomeScreen")
	public void I_am_navigated_to_Facebook_HomeScreen()
	{
		System.out.println("Test6");
	}
	
	@And("I can see Homescreen Feeds")
	public void I_can_see_Homescreen_Feeds()
	{
		System.out.println("Test7");
	}
	
	
	
}
