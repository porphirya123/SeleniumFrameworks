package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PlayWithExcel {

	
	FileInputStream fis;
	FileOutputStream fo;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
//	@Test
	public void readExcel() throws IOException
	{
		fis = new FileInputStream("testdata.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		for(int i=1;i<rows;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username : "+ username +" Password : "+password);
		
		}
		
	}
	
	
	@Test
	public void writeExcel() throws IOException
	{
		
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Sheet1");
		
		XSSFRow headrow = sheet.createRow(0);
		headrow.createCell(0).setCellValue("Username");
		headrow.createCell(1).setCellValue("Password");
		
		XSSFRow browone = sheet.createRow(1);
		XSSFRow browtwo = sheet.createRow(2);
		
		browone.createCell(0).setCellValue("Ram");
		browone.createCell(1).setCellValue("Singh");
		browtwo.createCell(0).setCellValue("Suresh");
		browtwo.createCell(1).setCellValue("Verma");
		
		
		fo = new FileOutputStream("test.xlsx");
		workbook.write(fo);
		
		System.out.println("File created Successfully!!!");
		
		
		
		
		
		
		
		
	}
	
	
	
}
