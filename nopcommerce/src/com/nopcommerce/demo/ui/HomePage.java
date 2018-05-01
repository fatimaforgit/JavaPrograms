package com.nopcommerce.demo.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

	WebDriver driver;
	
	HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	Identifying Register link
	public WebElement registerLink()
	{
		return driver.findElement(By.linkText("Register"));
	}
	
//	Identifying nopcommerce Logo
	public WebElement nopcommerceLogo()
	{
		return driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	}
	
//	Identifying login link
	public WebElement loginLink()
	{
		return driver.findElement(By.linkText("Log in"));
	}
	
//	Identifying Wish list link
	public WebElement wishlistLink()
	{
		return driver.findElement(By.linkText("Wishlist"));
	}
	
//	Identifying Shopping cart link
	public WebElement shoppingcartLink()
	{
		return driver.findElement(By.linkText("Shopping cart"));
	}
	
//	Identifying search text box
	public WebElement searchTextbox()
	{
		return driver.findElement(By.id("small-searchterms"));
	}
	
//	Identifying search button
	public WebElement searchButton()
	{
		return driver.findElement(By.className("button-1 search-box-button"));
	}
	
//	Identifying computers from main catagory
	public WebElement computersCatagory()
	{
		return driver.findElement(By.partialLinkText("Computers"));
	}
	
//	Identifying electronics from main catagory
	public WebElement electronicsCatagory()
	{
		return driver.findElement(By.partialLinkText("Electronics"));
	}
	
//	Identifying apparel from main catagory
	public WebElement apparelCatagory()
	{
		return driver.findElement(By.partialLinkText("Apparel"));
	}
	
//	Identifying Digital downloads from main catagory
	public WebElement digitaldownloadsCatagory()
	{
		return driver.findElement(By.partialLinkText("Digital downloads"));
	}
	
//	Identifying Books from main catagory
	public WebElement booksCatagory()
	{
		return driver.findElement(By.partialLinkText("Books"));
	}
	
//	Identifying Jewelry from main catagory
	public WebElement jewelryCatagory()
	{
		return driver.findElement(By.partialLinkText("Jewelry"));
	}
	
//	Identifying Gift Cards from main catagory
	public WebElement giftcardsCatagory()
	{
		return driver.findElement(By.partialLinkText("Gift Cards"));
	}
	
//	Identifying Welcome to our store text
	public WebElement welcomeToOurStoreText()
	{
		return driver.findElement(By.xpath("//h2[text()='Welcome to our store']"));
	}
	
//	Identifying Featured products text
	public WebElement featuredProductsText()
	{
		return driver.findElement(By.xpath("//strong[text()='Featured products']"));
	}
	

}
