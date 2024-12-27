package dropdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

public class ExcerciseDropdown {
	
WebDriver driver;
	
	public void test()
	{
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",Collections.singleton("enable-automation"));
		option.setAcceptInsecureCerts(true);
		
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		Actions act = new Actions(driver);
		
		WebElement abTesting = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a"));
		
		SoftAssert asst = new SoftAssert();
		asst.assertEquals("test", "Test");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(abTesting));
	
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.pollingEvery(Duration.ofSeconds(10))
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(abTesting));
		
		act.click(abTesting).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshot.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().to("https://the-internet.herokuapp.com/");
		act.click(driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"))).perform();
	
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		driver.navigate().back();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/manager/openAccount");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'userSelect']"));
	//	dropdown.click();
		Select sl = new Select(dropdown);
		sl.selectByValue("2");

}
	
	public static void main(String[] args) {
		ExcerciseDropdown obj = new ExcerciseDropdown();
		obj.test();
	}
}
