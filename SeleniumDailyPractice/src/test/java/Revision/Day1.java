package Revision;

import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void getData()
	{
		try {
		FileInputStream fis = new FileInputStream("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\testdata\\CustData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rows-1][cells];
		
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cells;j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j] =df.formatCellValue( sheet.getRow(i+1).getCell(j));			}
		}
		
		for(String[] da: data)
		{
			Arrays.toString(da);
			System.out.println(Arrays.toString(da));
		}
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		Rectangle rec= new Rectangle();
		
		WebDriver driver;
		
		FileInputStream fis = new FileInputStream("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\testdata\\CustData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int rowsHeadless = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rows-1][cols];
		
		
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}
		
		for(String[] d: data)
		{
			
		
		System.out.println(Arrays.toString(d));
		}
		
		System.out.println(rows);
		System.out.println(rowsHeadless);
		System.out.println(cols);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
