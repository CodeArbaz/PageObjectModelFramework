package com.Arbaz.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Arbaz.base.Page;
import com.Arbaz.pages.HomePage;
import com.Arbaz.pages.LoginPage;
import com.Arbaz.pages.ZohoAppPage;
import com.Arbaz.pages.crm.CRMHomePage;
import com.Arbaz.pages.crm.accounts.AccountsPage;
import com.Arbaz.pages.crm.accounts.CreateAccountsPage;

public class LoginTest {

	public static void main(String args[]) throws InterruptedException
	{
		
		
		HomePage home= new HomePage();
		LoginPage lp= home.goToLogin();
		ZohoAppPage zp= lp.doLogin("arbaz.m.surti@gmail.com", "Zohois#1");
		zp.gotoCRM("TEST","1234567891");
		AccountsPage account= Page.menu.goToAccounts();
		CreateAccountsPage cap= account.gotoCreateAccounts();
		cap.createAccount("Sam Billings");
	}
	
	
	
}
