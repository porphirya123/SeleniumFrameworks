package windowhandles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class winHandles {
	
	
	WebDriver driver;
	
	public void playWithWindows()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String>windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		
//		List<String>list = new ArrayList<>();
//		
//		while(it.hasNext())
//		{
//			String curwin = it.next();
//			list.add(curwin);
//		}
//		
//		
		
		
		for(String win:windows)
		{
			driver.switchTo().window(win);
			driver.get("https://www.apple.com");
		}
		
		
		for(String nwin:windows)
		{
			driver.switchTo().window(nwin);
			driver.close();
			
		}
		
		
	}
	
	public static void main(String[] args) {
		winHandles obj = new winHandles();
		obj.playWithWindows();
	}
	
	

}
