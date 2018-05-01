package com.nopcommerce.demo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement pleaseSignInText()
	{
		return driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
	}
	
	public WebElement newCustomerText()
	{
		return driver.findElement(By.xpath("//strong[text()='New Customer']"));
	}
	
	public WebElement newCustomerParagraphText()
	{
		return driver.findElement(By.xpath("//div[contains(text(),'By creating an account on our website you will be able to shop faster')]"));
	}
	
	public WebElement registerButton()
	{
		return driver.findElement(By.className("button-1 register-button"));
	}
	
	public WebElement returningCustomer()
	{
		return driver.findElement(By.xpath("//strong[text()='Returning Customer']"));
	}
	
	public WebElement emailTextbox()
	{
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement emailText()
	{
		return driver.findElement(By.xpath("//label[text()='Email:']"));
	}
	
	public WebElement passwordTextbox()
	{
		return driver.findElement(By.id("Password"));
	}
	
	
	
	public WebElement passwordText()
	{
		return driver.findElement(By.xpath("//label[text()='Password:']"));
	}
	
	public WebElement rememberMeCheckbox()
	{
		return driver.findElement(By.id("RememberMe"));
	}
	
	public WebElement rememberMeText()
	{
		return driver.findElement(By.xpath("//label[text()='Remember me?']"));
	}
	
	public WebElement forgotPasswordLink()
	{
		return driver.findElement(By.linkText("Forgot password?"));
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(By.className("button-1 login-button"));
	}
	
	public WebElement aboutLogin_RegistrationText()
	{
		return driver.findElement(By.xpath("//h2[contains(text(),'About login / registration')]"));
	}


}
