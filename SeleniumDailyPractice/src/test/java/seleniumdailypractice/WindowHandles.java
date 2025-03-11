package seleniumdailypractice;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com");
		driver.manage().window().maximize();
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows = driver.getWindowHandles();
		for(String window: windows)
		{
			if(!window.equals(currentWindow))
			{
				driver.switchTo().window(window);
				driver.get("https://www.flipkart.com");
			}
		}
		driver.switchTo().window(currentWindow);
		driver.close();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys("a").build().perform();
		
		
	}

}
