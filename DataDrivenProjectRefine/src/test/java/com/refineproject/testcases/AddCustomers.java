package com.refineproject.testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.refineproject.baseclass.ProjectBaseClass;

public class AddCustomers extends ProjectBaseClass{
	
	
	
	
	@Test(dataProvider = "getData")
	public void addCustomers(String firstName, String lastName, String postCode)
	{
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
	
	Object data[][] =null; 
	
	int rows = sheet.getPhysicalNumberOfRows();
	
	for(int i=0;i<rows;i++)
	{
	data = new String[i][i];	
	 data = sheet.getRow(i+1).getCell(i).getStringCellValue();
	lastName  = sheet.getRow(i+1).getCell(1+1).getStringCellValue();
	postCode  = sheet.getRow(i+1).getCell(1+2).getStringCellValue();
	
}
		
		
		
		
		
		
	}

}
