package basicauthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthentication {
	
	WebDriver driver;
	
	@Test
	public void basicAuthen()
	{
		
		driver = new ChromeDriver();
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Basic Auth')]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
	public static void checkBasic()
	{
		
		WebDriver driver = new ChromeDriver();
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
		
		
		
	}
	
	
	}
	


