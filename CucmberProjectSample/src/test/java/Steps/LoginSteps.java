package Steps;

import io.cucumber.java.en.*;


public class LoginSteps {
	
	@Given("User is on WayToAutomatin Homepage")
	public void user_is_on_way_to_automatin_homepage() {
	   
		System.out.println("@Given -- User is on WayToAutomatin Homepage");
	}

	@When("I click on Customer Login link")
	public void i_click_on_customer_login_link() {
		System.out.println("@When -- I click on Customer Login link");
	   }
	
	
	@Then("I provide {string} user id")
	public void I_provide_user_id(String username) {
		
		System.out.println("@Then -- I provider "+username+"user id");
		}

	@And("I provide {string} password")
	public void I_provide_password(String password) {
		
		System.out.println("@And-- I provider "+password+" Password");
		}

	@And("I click on Login button")
	public void I_click_on_Login_button()
	{
		System.out.println("@And-- I click on Login Button");
	} 
	
}
