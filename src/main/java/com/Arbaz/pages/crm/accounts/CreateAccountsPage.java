package com.Arbaz.pages.crm.accounts;

import org.openqa.selenium.By;

import com.Arbaz.base.Page;

public class CreateAccountsPage extends Page {

	public void createAccount(String accountName)
	{
		//driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(accountName);
		type("accountname_XPATH",accountName);
		
		
	}
	
	
}
