package PlayWithWebElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement textBox = driver.findElement(By.id("userName"));
		
		System.out.println("Get Tag Name : "+textBox.getTagName());
		System.out.println(textBox.getAttribute("Full Name"));
		System.out.println("Is Displayed : "+textBox.isDisplayed());
		System.out.println("Is Enabled : "+textBox.isEnabled());
		System.out.println("Get Text : "+textBox.getText());
		System.out.println("Hash Code " +textBox.hashCode());
		System.out.println("Get Location : "+textBox.getLocation());
		System.out.println("Get Rectange : "+textBox.getRect());
		System.out.println("Get ShowdowRoot : "+textBox.getShadowRoot());
		System.out.println("Get Size : "+textBox.getSize());
		if(textBox.isEnabled())
		{
		textBox.sendKeys("Hello Man");
		}
		File src = textBox.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshot1.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
