package basicauthentication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseBasicAuthentication {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Basic Auth')]")).click();
		 
		
		driver.navigate().to("https:www.apple.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.manage().logs());
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
	
		System.out.println(driver.manage().logs());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.amazon.in");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		
		driver.quit();
		
		
	}

}
