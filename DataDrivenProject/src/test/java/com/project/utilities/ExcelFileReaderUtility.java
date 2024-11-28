package com.project.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReaderUtility {

	/*How to read data from Excel File
	 * 
	 * Declare FileInputStream - to find the excel file location Declare
	 * XSSFWorkbook Class object and load FileInputStream variable Declare XSSFSheet
	 * object and load XSSFWorkbook variable Get the total count of rows using
	 * method getPhysicalNumberofCells(); User for loop to extract each value of
	 * rows Store it into locally declared String variables like user name and
	 * password using method sheet.getRow(0).getcell(0).getStringValue();
	 */

	public static FileInputStream file;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public void readExcelfile() {
		try {
			file = new FileInputStream(
					"C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\testdata\\testdata.xlsx");
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet("Sheet1");
			int rows = sheet.getPhysicalNumberOfRows();

			for (int i = 0; i < rows; i++) {
				String username = sheet.getRow(i).getCell(0).getStringCellValue();
				String password = sheet.getRow(i).getCell(1).getStringCellValue();

				System.out.println("Username : " + username + "Password : " + password);

			}

		} catch (Exception e) {
			System.out.println("Something went woring" + e);
		}

	}

	
	/*How to create a new excel file and write data in that File
	 * 
	 *
	 * XSSFWorkbook Class object and load FileInputStream variable Declare XSSFSheet
	 * Declare XSSFSheet and assign value using workbook.createSheet("Sheet1");
	 * Declare XSSFRow heardrow variable and assign value using sheet.createRow(0)  
	 * Create cells (columns) as per your requirement like username, password etc. using headrow.createCell(0).setCellValue("username");
	 * Create another row for data and use same method to create data into it - Refer below program
	 */
	
	public void writeExcelFile()
	{
		workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		XSSFRow headerrow =sheet.createRow(0); 
		headerrow.createCell(0).setCellValue("Username");
		headerrow.createCell(1).setCellValue("Password");
		headerrow.createCell(2).setCellValue("Country");
		XSSFRow datarow =sheet.createRow(1); 
		datarow.createCell(0).setCellValue("Santosh");
		datarow.createCell(1).setCellValue("test@123");
		datarow.createCell(2).setCellValue("India");
		
		XSSFRow seconddatarow =sheet.createRow(2);
		seconddatarow.createCell(0).setCellValue("Ankita");
		seconddatarow.createCell(1).setCellValue("test@123");
		seconddatarow.createCell(2).setCellValue("USA");
		
		FileOutputStream fileout = null;
		try {
			fileout = new FileOutputStream("test1.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fileout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("File created Successfully !!");
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ExcelFileReaderUtility obj = new ExcelFileReaderUtility();
		obj.writeExcelFile();

	}

}
