package com.Arbaz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Arbaz.base.Page;

public class LoginPage extends Page {


	
	public ZohoAppPage doLogin(String username, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		type("email_ID",username);
		click("nextbtn_ID");
		type("password_ID",password);
		click("signbtn_XPATH");
		return new ZohoAppPage();
	}
}
