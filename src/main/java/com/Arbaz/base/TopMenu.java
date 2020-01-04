package com.Arbaz.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Arbaz.pages.crm.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goToHome() {

	}
	public AccountsPage goToAccounts() {

		//driver.findElement(By.linkText("Accounts")).click();
		Page.click("accountstab_LINKTEXT");
		return new AccountsPage();
		
	}


	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}
	
	public void goToAnalytics() {

	}
	
	public void goToProjects() {

	}
	
	public void signOut()
	{
		
	}
}
