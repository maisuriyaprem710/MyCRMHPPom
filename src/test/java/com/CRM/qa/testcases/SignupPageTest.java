package com.CRM.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.CRMPage;
import com.CRM.qa.pages.LoginPage;
import com.CRM.qa.pages.SignupPage;

public class SignupPageTest extends TestBase{
	CRMPage Cp;
	SignupPage Sp;
	LoginPage Lp;
	
	public SignupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initailization();
		Cp=new CRMPage();
		Cp.openSignupPage();
		Sp=new SignupPage();
	}
	
	@Test(priority=1)
	public void pageTitleTest() {
		Assert.assertEquals(Sp.getPagetitile(), "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void openLoginPageTest() {
		Lp=Sp.openLoginPage();
		
	}
	
	
	@AfterMethod
	public void teardown() {
		wd.quit();
	}

}
