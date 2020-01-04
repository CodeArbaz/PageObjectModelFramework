package com.Arbaz.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.Arbaz.base.Page;

public class BaseTest {

	@AfterSuite
	public void tearDown()
	{
		Page.quit();
	}
	
	
	
	
}
