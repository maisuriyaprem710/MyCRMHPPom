package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.CRMPage;
import com.CRM.qa.pages.LoginPage;
import com.CRM.qa.pages.SignupPage;

public class CRMPageTest extends TestBase{

	CRMPage Cp;
	LoginPage Lp;
	SignupPage Sp;
	
	public CRMPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initailization();
		Cp=new CRMPage();
	}
	
	
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(Cp.getPageTitle(), "#1 Free CRM Power Up your Entire Business Free Forever");
	}
	
	@Test
	public void imgTest() {
		 Cp.getimg();
	}
	
	@Test
	public void openLoginPageTest() {
		Lp=Cp.openLoginPage();
	}
	
	@Test
	public void openSignupPageTest() {
		Sp=Cp.openSignupPage();
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		wd.quit();
	}
	
	
	
	
	
}
