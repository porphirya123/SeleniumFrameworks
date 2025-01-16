package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	
	public static File excelFile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream fi;
	
	
	
	public static void excelReader()
	{
		try {
		excelFile = new File("C:\\eclipse-workspace\\DataDriven_SevenJan\\src\\test\\resources\\testdata\\CustData.xlsx");
		System.out.println(excelFile.exists());
		fi = new FileInputStream(excelFile);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet("sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int lastRows = sheet.getLastRowNum();
		
		System.out.println(rows);
		System.out.println(lastRows);
		
//		for(int i= 0;i<rows;i++)
//		{
//			for(int j=0;j<rows;j++)
//			{
//				
//			}
//		}
//		
//		
//		
//		workbook.close();
//		fi.close();
		
		
		
		
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		//ExcelReader obj = new ExcelReader();
		excelReader();
		
		
	}
	
	
}
