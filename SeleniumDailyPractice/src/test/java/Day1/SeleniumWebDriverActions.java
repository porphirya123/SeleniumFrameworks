package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class SeleniumWebDriverActions {
	
	WebDriver driver;
	WebDriver wait;
	
			
	@Test
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.apple.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		Select sl = new Select(driver.findElement(By.xpath("//a")));
	
		
	//	driver.quit();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		WebElement login = driver.findElement(By.xpath("//button[contains(text(), \"Bank Manager Login\")]"));
		
		
		driver.findElement(By.xpath("//button[contains(text(), \"Bank Manager Login\")]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[contains(text(), 'Add Customer')]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[contains(@placeholder, 'First Name')]")).sendKeys("Santosh");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		String currentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		String title = driver.getTitle();
		System.out.println("Get Class : " + driver.getClass());
		String window = driver.getWindowHandle();
		System.out.println("Current url : "+currentUrl);
		//System.out.println("PageSource : "+pageSource);
		System.out.println("Title : "+title);
		System.out.println("Window Handle : "+ window);
	}
	
	
	
	
//	@Test
//	public void scrollDown()
//	{
//		
//	}
	
	
//	@AfterSuite
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	

}
