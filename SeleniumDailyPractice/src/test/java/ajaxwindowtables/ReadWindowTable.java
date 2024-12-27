package ajaxwindowtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWindowTable {
	
	WebDriver driver;
	
	public void getData()
	{
	driver = new ChromeDriver();
	driver.get("https://money.rediff.com/gainers");
	
	
	List<WebElement> rowlinks = driver.findElements(By.xpath("//table[@class = \"dataTable\"]/tbody/tr"));
	List<WebElement> collinks = driver.findElements(By.xpath("//table[@class = \"dataTable\"]/tbody/tr[1]/td"));
	
	int rowsize = rowlinks.size();
	int colsize = collinks.size();
	
	System.out.println("Total rows : "+rowsize);
	System.out.println("Total columns : "+colsize);
	
	for(int i=1;i<rowsize;i++)
	{
		for(int j=1;j<colsize;j++)
		{
			System.out.print(driver.findElement(By.xpath("//table[@class = \"dataTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+ " " );
			
		}System.out.println();
	}
	
	driver.quit();
	
	

	
	}
	
	public static void main(String[] args) {
	
		ReadWindowTable obj = new ReadWindowTable();
		obj.getData();
		
		
	}
	
	
	
	
	
	
	

}
