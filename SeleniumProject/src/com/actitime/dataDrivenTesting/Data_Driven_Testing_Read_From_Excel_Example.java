package com.actitime.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Data_Driven_Testing_Read_From_Excel_Example 
{

	public static void main(String[] args)  
	{
		try
		{
		File f = new File("C://JavaPrograms/SeleniumProject/src/com/actitime/dataDrivenTesting/TestDataExample.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//fetching data from second row first column
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		
		String data = c.toString();
		System.out.println(data);
		
		//to get number of rows and cells
		int rowNumbers = s.getLastRowNum();
		int columnNumbers = r.getLastCellNum();
		
		System.out.println("Number of rows = " + rowNumbers);
		System.out.println("Number of columns = " + columnNumbers );
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
