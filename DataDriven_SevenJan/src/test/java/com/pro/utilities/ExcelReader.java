package com.pro.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	public static File excelFile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream fi;
	
	
	@DataProvider(name = "getdata")
	public static String[][] getData()
	{
		
		excelFile = new File("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\testdata\\CustData.xlsx");
		System.out.println(excelFile.exists());
		try {
			fi = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = workbook.getSheet("sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int lastRows = sheet.getLastRowNum();
		int lastCol = sheet.getRow(0).getLastCellNum();
			
		String[][] data = new String[rows-1][lastCol];
		
		for(int i= 0;i<rows-1;i++)
		{
			for(int j=0;j<lastCol;j++)
			{
				DataFormatter df = new DataFormatter();
				
				data[i][j] =df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}
		
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
		
	}

}
