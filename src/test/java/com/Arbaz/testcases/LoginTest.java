package com.Arbaz.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.Arbaz.pages.HomePage;
import com.Arbaz.pages.LoginPage;
import com.Arbaz.pages.ZohoAppPage;
import com.Arbaz.utilities.Utilities;

public class LoginTest extends BaseTest {

	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException
	{

		HomePage home= new HomePage();
		LoginPage lp= home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		
		
	}
	
	
	
	
}
