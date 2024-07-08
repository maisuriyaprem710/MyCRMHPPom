package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.CRMPage;
import com.CRM.qa.pages.ContactsPage;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LoginPage;

public class HomePagetest extends TestBase{

	LoginPage Lp;
    CRMPage Cp;
	HomePage Hp;
	ContactsPage Cop;
	
	public HomePagetest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initailization();
		Cp=new CRMPage();
		Cp.openLoginPage();
		Lp=new LoginPage();
		Lp.login(prop.getProperty("username"), prop.getProperty("password"));
		Hp=new HomePage();
		Hp.closeAlertScreen();
	}
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(Hp.getPageTitle(), "Cogmento CRM");
	}
	
	@Test
	public void accountUserVerificationtest() {
		Assert.assertEquals(Hp.getUserAccount(), "Pren Maisuriya");
		
	}
	
	@Test
	public void openContactsPageTest() {
		Cop=Hp.openContact();
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		wd.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
