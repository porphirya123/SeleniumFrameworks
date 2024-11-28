package com.project.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumPracTuesday {

	WebDriver driver;
	
	
	
//	@Test(priority=1)
//	public void scroll(WebDriver driver)
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//	
//	@BeforeSuite
//	public void setup()
//	{
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");	
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
////		wait.until(ExpectedConditions.elementToBeSelected(""));
////		
//		Wait<WebDriver> w = new FluentWait(driver)
//				.pollingEvery(Duration.ofSeconds(4))
//				.withTimeout(Duration.ofSeconds(4))
//				.ignoring(NoSuchElementException.class);
//		
//		String window = driver.getWindowHandle();
//		Set<String> windows = driver.getWindowHandles();
//		
//		Actions act = new Actions(driver);
//		//act.dragAndDrop(null, null)
//		act.click().perform();
//		
//		
//		Alert alert = driver.switchTo().alert();
//		alert.getText();
//		
//		driver.switchTo().frame(0);
//		SoftAssert as = new SoftAssert();
//		as.fail();
//		
//		Assert.assertEquals(false, false);
//					
//	}
//	
//	@Test
//	public void begin()
//	{
//		System.out.println("Beginning of the TCs");
//	}
//	
//	@Test(priority=2)
//	public void screenshot()
//	{
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(src, new File("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\screenshots\\practice.jpeg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("Skipping the TC");
//		throw new SkipException("TC Skipped");
//
//	}
//
//	@AfterSuite
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
	
	@Test
	public void readExcelfile()
	{
		try {
			
		
		FileInputStream fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\testdata\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rows;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username +"-> " +password);
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	
	
	
	@Test
	public void writeExcel()
	{
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		XSSFRow headrow = sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Username");
		sheet.getRow(0).createCell(1).setCellValue("Password");
		XSSFRow datarow = sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Santosh");
		sheet.getRow(1).createCell(1).setCellValue("Kumar");
		
		try
		{
		FileOutputStream fo = new FileOutputStream("newdata.xlsx");
		workbook.write(fo);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
		
		
	}
	
	
	

