package windowhandles;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPractice {
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.apple.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String>windows = driver.getWindowHandles();
		
		for(String win:windows)
		{
			driver.switchTo().window(win);
			driver.get("https://www.amazon.in");
			//driver.close();
			
		}
		
		
		
	}

}
