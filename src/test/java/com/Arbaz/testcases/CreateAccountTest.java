package com.Arbaz.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Arbaz.base.Page;
import com.Arbaz.pages.ZohoAppPage;
import com.Arbaz.pages.crm.accounts.AccountsPage;
import com.Arbaz.pages.crm.accounts.CreateAccountsPage;
import com.Arbaz.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String, String> data)
	
	{
		
		ZohoAppPage zp= new ZohoAppPage();
		zp.gotoCRM("TEST","1234567891");
		AccountsPage account= Page.menu.goToAccounts();
		CreateAccountsPage cap= account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		//Assert.fail("Create account test failed");
		
	}
	
	
	
}
