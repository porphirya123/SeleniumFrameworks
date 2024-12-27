package frames;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Frames {
	
	WebDriver driver;
	
	@Test
	public void switchFrame()
	{
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
		
		
		
		driver = new ChromeDriver(opt);
		
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().defaultContent();
		
	}
	

}
