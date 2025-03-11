package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;


public class LoginProductionSteps {
	
	
	

	@And("capture captcha image")
	public void capture_captcha_image()
	{
		System.out.println("And -- Capture Captcha image");
	}


@And("user enters userid and password")
public void user_enters_userid_and_password(io.cucumber.datatable.DataTable dataTable) {
	
	// ****Read Data Using List
//	List<List<String>> data = dataTable.asLists();
//	
//	System.out.println("FirstName : " + data.get(0).get(0));
//	System.out.println("Lastname : " + data.get(0).get(1));
	
	//****Read Data Using Map
	
//	List<Map<String, String>> map = dataTable.asMaps();
//	System.out.println("FirstName = "+map.get(0).get("FirstName")+"---Lastname " + map.get(0).get("LastName"));
	
	
	//*** Using Parametrization
	for(Map<String, String> map : dataTable.asMaps(String.class, String.class))
	{
	System.out.println("Firstname : "+map.get("FirstName")+" Last Name : "+map.get("LastName"));	
	}
	
	
	
    throw new io.cucumber.java.PendingException();
}
	
	

}
