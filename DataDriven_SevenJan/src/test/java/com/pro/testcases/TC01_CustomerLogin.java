package com.pro.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.pro.base.ProjectBaseClass;
import com.pro.utilities.ExcelReader;

public class TC01_CustomerLogin extends ProjectBaseClass{
	
	public static File excelFile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream fi;
	
	
	@Test
	public void customerLogin()
	{
		driver.findElement(By.xpath(or.getProperty("customerLogin"))).click();
		log.debug("Clicked on Customer Login");
		driver.findElement(By.xpath(or.getProperty("home"))).click();
		log.debug("Clicked on home link");
		
		
	}

	
	
	
	
	
	
}

