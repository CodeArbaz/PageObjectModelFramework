package com.Arbaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Arbaz.base.Page;

public class HomePage extends Page {

	
	public void goToSupport()
	{
		driver.findElement(By.className("zh-support"));
	}
	
	
	public void goToSignUp()
	{
		driver.findElement(By.className("zh-signup")).click();
	}
	
	public LoginPage goToLogin()
	{
		click("loginlink_CLASSNAME");
		return new LoginPage();
	}
	
	public void goToCRMPlusLearnMore()
	{
		driver.findElement(By.xpath("//a[@class='lm'][@href='/crm/crmplus/?src=zoho-home&ireft=ohome'])"));		
		
	}
	
	public void validateFooterLinks()
	{
		
	}
	
}
