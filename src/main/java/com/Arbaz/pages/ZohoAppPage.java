package com.Arbaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Arbaz.base.Page;
import com.Arbaz.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	

	public void gotoBooks()
	{
		driver.findElement(By.xpath("//span[@class='zicon-apps-books zicon-apps-96']")).click();
	}
	
	public CRMHomePage gotoCRM(String orgName, String orgPhoneNumber)
	{
		driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']")).click();
		//driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys(orgName);
		//driver.findElement(By.xpath("//input[@id='orgPhone']")).sendKeys(orgPhoneNumber);
		//Uncheck load sample data checkbox
		//driver.findElement(By.xpath("//input[@class='dataSamplePopulatedCOB']")).click();
		//driver.findElement(By.xpath("//input[@class='primarybtn Roboto']")).click();
		//driver.switchTo().alert().dismiss();
		return new CRMHomePage();
	}
	
	public void gotoInvoice()
	{
		driver.findElement(By.xpath("//span[@class='zicon-apps-invoice zicon-apps-96']")).click();
		
	}
	
	
	
}
