package windowhandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPrac {

	WebDriver driver;
	
	@Test
	public void checkAlerts()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://hdfcbank.com");
		driver.findElement(By.xpath("//*[@id=\"custom-button\"]/div/div/div/button")).click();
		driver.findElement(By.linkText("NetBanking")).click();
		
		
	
		
		Set<String>windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		
		
		List<String> winIndex = new ArrayList<String>();

		
		while(it.hasNext())
		{
			String winid = it.next();
			winIndex.add(winid);
			
		}
		System.out.println(winIndex.get(0));
		System.out.println(winIndex.get(1));
		driver.switchTo().window(winIndex.get(1));
		driver.findElement(By.xpath("//input[contains(@name, 'fldLoginUserId')]")).sendKeys("248699982");
		
		
			
		//driver.close();
		
	}
	
	
}
