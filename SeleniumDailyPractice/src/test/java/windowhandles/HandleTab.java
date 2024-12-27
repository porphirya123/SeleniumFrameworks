package windowhandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTab {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[13]/div[4]/div/div/div/div[1]/div/div[1]/div[3]/div/div[3]/div/div/div/div[1]/div/div/ul/li[2]/a")).click();
		Set<String>wins = driver.getWindowHandles();
		for(String tab: wins)
		{
			driver.switchTo().window(tab);
			driver.findElement(By.xpath("//*[contains(text(), 'About Us')]")).click();
			driver.close();
		}
		
		
		
		
	}
	
	
	
	
}
