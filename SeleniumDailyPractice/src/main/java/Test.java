import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Test {
	
	
	public static void main(String[] args) {
		
	String text = "We are playing football in the ground";
	
	String[] words = text.split(" ");
	
	
	
	
	for(String word: words)
	{
		for(int i=0;i<word.length();i++)
		{
			
			try {
				
				System.out.print(word.charAt(i+2)+"&" +word.charAt(i+3));
				
				break;
			}catch(Exception e)
			{
				System.out.println("Unable to find 3rd and 4th character. Word is short to meet the criteria");
			}
			
		}System.out.println();
	}
		
		
	}

}
