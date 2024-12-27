package chromeoptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOption {

	WebDriver driver;
	ChromeOptions option;
	
	@Test
	public void checkChromeOptions()
	{
		option = new ChromeOptions();
		//option.addArguments("--headless"); // Run the browser in the background
		option.setAcceptInsecureCerts(true); // bypass the insecure webpage message
		option.addArguments("disable-infobar");
		option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation")); //to remove message that your chrome is controlled by Automation
		// option.addArguments("window-size =1200, 800"); // to set your browser size
		option.addArguments("incognito");
		
		// how to launch your website in Mobile display view:
		Map<String, String>cellView = new HashMap<String, String>();
		cellView.put("deviceName" , "iPhone X");
		option.setExperimentalOption("mobileEmulation", cellView);
		
		driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.quit();
		
		
		
	}
	
	
}
