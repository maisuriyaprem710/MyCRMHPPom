package com.CRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CRM.qa.base.TestBase;
import com.CRM.qa.pages.CRMPage;
import com.CRM.qa.pages.ContactsPage;
import com.CRM.qa.pages.HomePage;
import com.CRM.qa.pages.LoginPage;
import com.CRM.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage Lp;
    CRMPage Cp;
	HomePage Hp;
	ContactsPage Cop;
	
	String Sheetname="Sheet1";
	
	public ContactsPageTest () {
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
		Hp.openContact();
		Cop=new ContactsPage();
	}
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(Cop.getTitle(), "Cogmento CRM");
	}
	
	@Test
	public void createbuttonPresenceTest() {
		Cop.createbuttonPresence();
	}
	
	@Test
	public void checkNoOfContcts() {
		
		System.out.println(Cop.getNoOfContacts());
	}
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(Sheetname);
		return data;
	}
	
	@Test(dataProvider="getTestData")
	public void validateCreateNewContact(String FirstName , String LastName, String Department, String Position) {
		Cop.createNewContact(FirstName, LastName, Department , Position);
	}
	
	
	@AfterMethod
	public void teardown() {
		wd.quit();
	}
	
	
	
	
}
