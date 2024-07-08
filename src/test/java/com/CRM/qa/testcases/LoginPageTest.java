package com.CRM.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.CRMPage;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{
	
	LoginPage Lp;
    CRMPage Cp;
	HomePage Hp;
    
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initailization();
		Cp=new CRMPage();
		Cp.openLoginPage();
		Lp=new LoginPage();
	}
	
	@Test(priority=1)
	public void pageTitletest() {
		Assert.assertEquals(Lp.getPageTitle(), " CRM");
	}
	
//	@Test(priority=2)
//	public void oprnLoginPagetest() {
//		Hp = Lp.login(prop.getProperty("username"), prop.getProperty("password"));
//		
//	}
	
	
	@AfterMethod
	public void teardown() {
		wd.quit();
	}
}
