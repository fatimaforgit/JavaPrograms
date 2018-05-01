package com.flipkart.test.functional;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.flipkart.test.config.CreateDriver;
import com.flipkart.ui.LenskartLoginPage;
import com.flipkart.util.Helper;

public class CreateTaskUS_001 
{
	
	@Test
	public void TC_001()
	{
		WebDriver driver = CreateDriver.getDriver();
			
		LenskartLoginPage lp = new LenskartLoginPage(driver);
		Helper.getExcelData(fileName, sheetName, rowIndex, cellIndex)
		lp.getUsernameTextbox().sendKeys("some");

	}

}
