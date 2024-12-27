package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	
	
	@Test
	public void webDriver() throws IOException
	{
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//href"))));
		
		Wait<WebDriver> newwait = new FluentWait(driver)
				.pollingEvery(Duration.ofSeconds(4))
				.withTimeout(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//href"))));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot"));
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		alert.dismiss();
		
		Actions act = new Actions(driver);
		act.contextClick().perform();
		act.sendKeys(Keys.ENTER).sendKeys(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL);
		
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		
		
		
		
		
		
		
		driver.navigate().refresh();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.apple.com");
		
		
		
		
		
		
		
		
		
	}

}
