package actionsapi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionAPI {
	
	WebDriver driver;
	
	@Test
	public void actionApi()
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		WebElement fas = driver.findElement(By.xpath("(//*[contains(text(), 'Fashion')])[1]"));
	//	WebElement sam = driver.findElement(By.linkText("Samsung"));
		
		Actions act = new Actions(driver);
		act.moveToElement(fas).perform();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://the-internet.herokuapp.com/inputs");
		
		WebElement input = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h3"));
		WebElement num = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
		act.doubleClick(input).sendKeys(Keys.chord(Keys.CONTROL+ "c"));
		//Action action = act.sendKeys(Keys.chord(Keys.CONTROL+ "v"));
	}

}
