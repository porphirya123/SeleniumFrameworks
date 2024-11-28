package com.refineproject.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	@Test
	public void readexcel()
	{
		try {
			
		
		fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProjectRefine\\src\\test\\resources\\testdata\\testdata.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		
		System.out.println(username + password);
		
		
		
		
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	
	

}
