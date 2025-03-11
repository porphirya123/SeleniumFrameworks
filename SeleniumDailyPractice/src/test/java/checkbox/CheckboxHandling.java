package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@type, 'checkbox')]"));
		for(WebElement checkbox: checkboxes)
		{
			boolean check = !checkbox.isSelected();
			if(check)
			{
				System.out.println(check);
				checkbox.click();
				
			}
		}
	}

}
