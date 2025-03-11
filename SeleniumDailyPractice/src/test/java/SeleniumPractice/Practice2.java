package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2 {
	
	
	
	
	
	
	public static void main(String[] args) {
		
	Practice2 obj = new Practice2();
	obj.readExcel();
	
	
	
	}
	
	public void playWithWebDriver()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div"))));
		
		Wait<WebDriver> fluent = new FluentWait<>(driver)
				.pollingEvery(Duration.ofSeconds(11))
				.withTimeout(Duration.ofSeconds(11))
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.alertIsPresent());
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshot.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
		Select sl = new Select(driver.findElement(By.xpath("//href")));
		sl.selectByIndex(0);
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0, 1000)", "");
	}
	
	
	public void readExcel()
	{
		try {
		File file = new File("C:\\eclipse-workspace\\SeleniumDailyPractice\\test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rows-1][cells];
		
		for(int i = 0;i<rows-1;i++)
		{
			for(int j=0;j<rows;j++)
			{
				DataFormatter df = new DataFormatter();
				
				data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));
				System.out.println(Arrays.toString(data));
				
			}
		
		
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	}
	

