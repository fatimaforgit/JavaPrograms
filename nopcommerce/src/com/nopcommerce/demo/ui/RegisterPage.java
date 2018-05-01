package com.nopcommerce.demo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage 
{
	WebDriver driver;

	RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}

//	Identifying Register text
	public WebElement registerText()
	{
		return driver.findElement(By.xpath("//h1[text()='Register']"));
	}
	
//	Identifying Your Personal Details text
	public WebElement yourPersonalDetailsText()
	{
		return driver.findElement(By.xpath("//strong[text()='Your Personal Details']"));
	}

//	Identifying Gender: text
	public WebElement genderText()
	{
		return driver.findElement(By.xpath("//label[text()='Gender:']"));
	}

//	Identifying male radio button
	public WebElement maleRadioButton()
	{
		return driver.findElement(By.id("gender-male"));
	}

//	Identifying male radio button text
	public WebElement maleRadioButtonText()
	{
		return driver.findElement(By.xpath("//label[text()='Male']"));
	}

	public WebElement femaleRadioButton()
	{
		return driver.findElement(By.id("gender-female"));
	}

	public WebElement femaleRadioButtonText()
	{
		return driver.findElement(By.xpath("//label[text()='Female']"));
	}


	public WebElement firstNameText()
	{
		return driver.findElement(By.xpath("//label[text()='First name:']"));
	}


	public WebElement firstNameTextbox()
	{
		return driver.findElement(By.id("FirstName"));
	}
	
	public WebElement firstNameAsterisk()
	{
		return driver.findElement(By.xpath("//div[input[@id='FirstName']]/span[text()='*']"));
	}
	
	public WebElement lastNameText()
	{
		return driver.findElement(By.xpath("//label[text()='Last name:']"));
	}


	public WebElement lastNameTextbox()
	{
		return driver.findElement(By.id("LastName"));
	}


	public WebElement lastNameAsterisk()
	{
		return driver.findElement(By.xpath("//div[input[@id='LastName']]/span[text()='*']"));
	}


	public WebElement dateOfBirthText()
	{
		return driver.findElement(By.xpath("//label[contains(text(),'Date of birth:')]"));
	}


	public WebElement dateDropdown()
	{
		return driver.findElement(By.name("DateOfBirthDay"));
	}


	public WebElement monthDropdown()
	{
		return driver.findElement(By.name("DateOfBirthMonth"));
	}


	public WebElement yearDropdown()
	{
		return driver.findElement(By.name("DateOfBirthYear"));
	}


	public WebElement emailText()
	{
		return driver.findElement(By.xpath("//label[text()='Email:']"));
	}
	
	public WebElement emailTextbox()
	{
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement emailAsterisk()
	{
		return driver.findElement(By.xpath("//div[input[@id='Email']]/span[text()='*']"));
	}
	
	public WebElement companyDetailsText()
	{
		return driver.findElement(By.xpath("//strong[text()='Company Details']"));
	}
	
	public WebElement companyNameText()
	{
		return driver.findElement(By.xpath("//label[contains(text(),'Company name:')]"));
	}
	
	public WebElement companyNameTextbox()
	{
		return driver.findElement(By.id("Company"));
	}
	
	public WebElement ()
	{
		return driver.findElement(By.xpath("//label[text()='Email:']"));
	}
	
	public WebElement ()
	{
		return driver.findElement(By.xpath("//label[text()='Email:']"));
	}
	
	public WebElement ()
	{
		return driver.findElement(By.xpath("//label[text()='Email:']"));
	}

}
