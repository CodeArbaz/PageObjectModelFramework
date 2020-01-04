package com.Arbaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkplacePage {

	WebDriver driver;
	
	public void WorkplacePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void goToWhyZoroWorkplace()
	{
		driver.findElement(By.xpath("//a[@href='/workplace/why-choose-zoho-workplace.html']")).click();
		
		
	}
	
	public void goToPricing()
	{
		driver.findElement(By.xpath("//a[href='/workplace/pricing.html']")).click();
		
	
	}
	
	public void goToResources()
	{
		
		driver.findElement(By.xpath("//a[href='/workplace/help/']")).click();
		
	}
	
	
}
