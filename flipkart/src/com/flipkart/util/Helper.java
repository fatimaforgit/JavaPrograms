package com.flipkart.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper 
{
// method to read from excel
	public static String getExcelData(String fileName, String sheetName, int rowIndex, int cellIndex)
	{
		String data=null;
		try
		{
			File f = new File("./TestData/"+fileName+".xlsx");

			FileInputStream fis = new FileInputStream(f);

			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);

			data = c.toString();
		}
		catch(Exception e)
		{

		}
		return data;
	}
	
// method to write into excel
	public static void writeDateToExcel(String filePath,String sheetName, int rowIndex, int cellIndex, String data)
	{
		try
		{
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);

			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.createCell(cellIndex);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
				
		}
		catch(Exception e)
		{
			
		}
	}
	
//method to handle alert
	public static WebDriver acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
		return driver;
	}
	
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	
	public static void getAlertText(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.getText();
	}
	
	public static void enterTextOnAlert(WebDriver driver, String text)
	{
		Alert alt = driver.switchTo().alert();		
		alt.sendKeys(text);
	}
	
//method to handle drop down list
	
	public static boolean dropdownIsMultiple(WebElement dropDownElement)
	{
		Select sct = new Select(dropDownElement);
		return sct.isMultiple();
		
	}
	public static void dropdownByIndex(WebElement dropDownElement, int index)
	{
		Select sct = new Select(dropDownElement);
		sct.selectByIndex(index);
	}
	
	public static void dropdownByValue(WebElement dropDownElement, String value)
	{
		Select sct = new Select(dropDownElement);
		sct.selectByValue(value);
	}
	
	public static void dropdownByVisibleText(WebElement dropDownElement, String text)
	{
		Select sct = new Select(dropDownElement);
		sct.selectByVisibleText(text);
	}
	
	
	public static void dropdownDeselectByIndex(WebElement dropDownElement, int index)
	{
		Select sct = new Select(dropDownElement);
		sct.deselectByIndex(index);
	}
	
	public static void dropdownDeselectByValue(WebElement dropDownElement, String value)
	{
		Select sct = new Select(dropDownElement);
		sct.deselectByValue(value);
	}

	public static void dropdownDeselectByVisibleText(WebElement dropDownElement, String text)
	{
		Select sct = new Select(dropDownElement);
		sct.deselectByVisibleText(text);
	}
	
	public static void dropdownDeselectAll(WebElement dropDownElement)
	{
		Select sct = new Select(dropDownElement);
		sct.deselectAll();
	}
	
// Method for mouse actions
	
	public static void mouseClick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.click(element).perform();
		
	}
	public static void mouseContextClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
	}
	public static void mouseDragAndDrop(WebDriver driver, WebElement from, WebElement to)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();
				
	}
	
// method to handle frames
	
	public static void framesByIndex(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public static void framesByid_Or_Class(WebDriver driver, String id_Or_Class)
	{
		driver.switchTo().frame(id_Or_Class);
	}
	public static void framesByWebElement(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public static void framesToTopWindow(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
}
