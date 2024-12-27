package windowhandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	WebDriver driver;
	
	public void getWindow()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		driver.get("https://www.apple.com");
		
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
	
		List<String> winIndex = new ArrayList<String>();

		while(it.hasNext())
		{
			String curWin = it.next();
			winIndex.add(curWin);
			
		}
		driver.switchTo().window(winIndex.get(0));
		System.out.println("Window at 0 Index is : "+ driver.getTitle());
		driver.close();

	}
	
	
	
	public static void main(String[] args) {
		
		WindowHandles obj = new WindowHandles();
		obj.getWindow();
		
	}
	

}
