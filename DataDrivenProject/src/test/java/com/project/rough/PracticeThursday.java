package com.project.rough;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PracticeThursday {

	
	
	public void revString(String text)
	{
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
		}
		
		
	}
	
	public void countWords(String sen)
	{
		String[] newString = sen.split(" ");
		for(int i=0;i<newString.length; i++)
		{
			System.out.println(newString[i]);
		}
		System.out.println(newString.length);
		
	}
	
	
	public void countOccurence(String text)
	{
		
		HashMap<Character, Integer>map = new HashMap<Character, Integer>();
		for(int i=0; i<text.length();i++)
		{
			char ch = text.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.print(map);

		
	}
	
	
	public void excelReader()
	{
		try {
			
		
		FileInputStream fis = new FileInputStream("C:\\eclipse-workspace\\DataDrivenProject\\src\\test\\resources\\testdata\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		String username = null;
		String password = null;
		
		System.out.println(rows);
		for(int i=0;i<rows;i++)
			
		{
			
		
		username = sheet.getRow(i).getCell(0).getStringCellValue();
		password = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Username : " + username +" password : " +password);
		}
		
		
		}catch(Exception e)
		{
			System.out.println("Unable to read the testdata file");
		}
		
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String username, String password)
	{
		
	}
	
	@DataProvider(name = "getData")
		
	{
		public Object[][] data = new Object[3][2];	
		data[0][0] = 
	}
	
	
	
	
	public static void main(String[] args) {
		
	
	
	PracticeThursday obj = new PracticeThursday();
//	obj.revString("Santosh");
//	obj.countWords("I like music so much");
	//obj.countOccurence("sdfasdf233esrsdfsfasd");
	obj.excelReader();
	}
}
