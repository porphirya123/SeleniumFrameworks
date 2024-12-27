package alerts;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertPrac {
	
	WebDriver driver;
	
	@Test
	public void alertHandle()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		//opt.addArguments("window-size = 1200, 500");
		driver = new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("This is a test");
		alert.accept();
		
		
		
		
	}
	

}
