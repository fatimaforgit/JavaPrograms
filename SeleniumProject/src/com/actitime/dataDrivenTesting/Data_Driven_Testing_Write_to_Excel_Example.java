package com.actitime.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data_Driven_Testing_Write_to_Excel_Example 
{

	public static void main(String[] args)  
	{
		try
		{
			
			File f = new File("C://JavaPrograms/SeleniumProject/src/com/actitime/dataDrivenTesting/TestDataExample.xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");

			//writing data into 3,0 and 3,1 cells
			Row r = s.getRow(2);
			Cell c = r.getCell(0);
			c.setCellValue("Some ID");

			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
