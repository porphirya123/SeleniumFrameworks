package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithiFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//List<WebElement> frames =driver.findElements(By.xpath(null)) ;
		driver.get("https:www.apple.com");
		driver.navigate().to("https://www.amazon.in");
		
		driver.quit();
	}

}
