package Day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

public class DayThree {
	
	@Test
	public void selniumActions()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(store));
		
		WebElement store = driver.findElement(By.xpath("(//*[contains(@aria-label, 'Store')])[1]"));
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.pollingEvery(Duration.ofSeconds(10))
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(store));
				
		Actions act = new Actions(driver);
		act.moveToElement(store).click().perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("test.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String win = driver.getWindowHandle();
		driver.switchTo().window(win);
		driver.get("https://www.amazon.in");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		driver.findElement(By.xpath("(//a[contains(text(), 'AirPods ')])[6]")).click();
		
		
		
		
		//driver.quit();
		
		
	}

}
