package com.project.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.baseclass.BaseClass;

public class excelReader extends BaseClass{

	public static FileInputStream file; 
	public static XSSFWorkbook workbook; 
	public static XSSFSheet sheet; 
	
	
	public static void main(String[] args) {
		
	try {
		file = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\testdata\\testdata.xlsx");
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
	}catch(Exception e)
	{
		System.out.println("Something went wrong");
	}
			
	int rows = sheet.getPhysicalNumberOfRows();
	
	for(int i=0;i<rows;i++)
	{
		String username = sheet.getRow(i).getCell(0).getStringCellValue();
		String password = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Username : "+username+ "Password : "+ password);
	}
	
	
	
	
	
	}
	
	
	
	
	

}
