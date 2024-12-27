package Cookies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookies {
	
	
	@Test
	public void handleCookies() throws AWTException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Total Size: "+cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			
		}
		
		Cookie newcookie = new Cookie("test123", "1212");
		
		
	}
	

}
