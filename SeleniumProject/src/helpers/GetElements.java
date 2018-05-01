package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetElements 
{
	public static WebElement byTagName(WebDriver driver, String TagName)
	{
		WebElement element = driver.findElement(By.tagName(TagName));
		return element;
	}
	
	public static WebElement byID(WebDriver driver, String id)
	{
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public static WebElement byName(WebDriver driver, String name)
	{
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public static WebElement byClass(WebDriver driver, String class_name)
	{
		WebElement element = driver.findElement(By.className(class_name));
		return element;
	}
	
	public static WebElement byLinkText(WebDriver driver, String linkText)
	{
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;
	}
	
	public static WebElement bypartialLinkText(WebDriver driver, String partialLinkText)
	{
		WebElement element = driver.findElement(By.partialLinkText(partialLinkText));
		return element;
	}
	
	public static WebElement byCss(WebDriver driver, String css)
	{
		WebElement element = driver.findElement(By.cssSelector(css));
		return element;
	}
	
	
	public static WebElement byxpath(WebDriver driver, String xpath)
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

}
