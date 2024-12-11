package Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverCommands {
	
	WebDriver driver;
	
	
	
	public void screenshot()
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("src\\test\\resources\\test.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000", " ");
	}
	
	public void waitmethod()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("q"))));
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(22))
				.withTimeout(Duration.ofSeconds(22))
				.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div"))));
		
		
	}
	
	
	
	
	@Test
	public void webdriverCommands()
	{
		
		if(driver==null)
		{
			
			driver = new ChromeDriver();					
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.apple.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		String handle = driver.getWindowHandle();
				
		//String title = driver.getTitle();
		
		
		driver.switchTo().window(handle);
		driver.findElement(By.name("q")).sendKeys("Hello Google");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
		
	}
	

}
