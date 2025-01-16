package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {
	
	public XSSFWorkbook workbook = new XSSFWorkbook();
	public XSSFSheet sheet = workbook.createSheet("sheet1");
	public FileOutputStream fs;
	
	public void createExcel() throws IOException
	{
		XSSFRow headrow = sheet.createRow(0);
		headrow.createCell(0).setCellValue("FirstNumber");
		headrow.createCell(1).setCellValue("SecondNumber");
		headrow.createCell(2).setCellValue("ThirdNumber");
		
		
		
		for(int i=0;i<10;i++)
		{
			XSSFRow bodyrow = sheet.createRow(i+1);
			for(int j=0;j<10;j++)
			{
				
				bodyrow.createCell(j).setCellValue((int)(Math.random()*100));
			}
		}
		
		
		
		 fs = new FileOutputStream("testExcel.xlsx");
		 workbook.write(fs);
		 workbook.close();
		 System.out.println("File Created Successfully");
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		CreateExcelFile obj = new CreateExcelFile();
		obj.createExcel();
	}
	
	
	

}
