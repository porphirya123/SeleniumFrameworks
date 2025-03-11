package robotClass;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadRobot {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		
		Actions act = new Actions(driver);
		act.moveToElement(upload).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection sc = new StringSelection("C:\\Users\\sampo\\OneDrive\\Desktop\\CustData.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	//	driver.quit();
		
		
	}
}
