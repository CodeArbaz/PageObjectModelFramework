package com.Arbaz.pages.crm.accounts;

import org.openqa.selenium.By;

import com.Arbaz.base.Page;

public class AccountsPage extends Page {

	public CreateAccountsPage gotoCreateAccounts()
	{
		
	//driver.findElement(By.xpath("//button[@class='lyte-button lytePrimaryBtn']")).click();
	click("createaccountbtn_XPATH");
	return new CreateAccountsPage();
		
	}
	
	public void gotoImportAccounts()
	{
		
	}
	
}
