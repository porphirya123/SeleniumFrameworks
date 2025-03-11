package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	
	public static void readExcel()
	{
		try {
		file = new File("C:\\eclipse-workspace\\SeleniumDailyPractice\\test.xlsx");
		fis = new FileInputStream(file);
		int rows = workbook.getSheetAt(0).getPhysicalNumberOfRows();
		sheet = workbook.getSheetAt(0);
		
		for(int i=0;i<rows-1;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username + " "+ password);
		}
		
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		readExcel();
		
	}
	
	
	

}
