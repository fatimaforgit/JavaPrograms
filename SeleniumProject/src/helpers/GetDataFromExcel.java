package helpers;
// Generalized class for fetching data from excel

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel
{
	public static void dataFromExcel(String username, String password, String sheetNumber, int rowNumber, int cellNumber)
	{
		try
		{
		File f = new File("C://JavaPrograms/SeleniumProject/src/com/actitime/dataDrivenTesting/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//fetching data from second row first column
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		
		String data = c.toString();
		System.out.println(data);
		
		//to get number of rows and cells
		int rowNumbers = s.getLastRowNum();
		int columnNumbers = r.getLastCellNum();
		}
		catch(Exception e)
		{
			
		}

	}
}
