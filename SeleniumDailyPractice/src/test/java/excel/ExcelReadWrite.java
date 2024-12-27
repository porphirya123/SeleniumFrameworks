package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelReadWrite {
	
	FileInputStream fs;
	FileOutputStream fo;
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	
	@Test
	public void readExcel()
	{
		try {
			
		
		fs = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProjectRefine\\src\\test\\resources\\testdata\\testdata.xlsx");
		workbook = new XSSFWorkbook(fs);
		sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rows;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username : "+ username +" Password : "+password);
		}
		
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
	}
	
	@Test
	public void writeExcel()
	{
		try {
			
		
		
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Sheet1");
		
		XSSFRow headerrow =sheet.createRow(0); 
		headerrow.createCell(0).setCellValue("Username");
		headerrow.createCell(1).setCellValue("Password");
		headerrow.createCell(2).setCellValue("Country");
		XSSFRow datarow =sheet.createRow(1); 
		datarow.createCell(0).setCellValue("Santosh");
		datarow.createCell(1).setCellValue("test@123");
		datarow.createCell(2).setCellValue("India");
        fo = new FileOutputStream("test.xlsx");
        workbook.write(fo);
		int rows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rows;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			String passcode = sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Username : "+ username +" Password : "+password +" Country : "+passcode);
		}
		
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
	}
	

}
