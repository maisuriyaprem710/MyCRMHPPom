package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class CRMPage extends TestBase{
	
	//Object repository or Page Factory
	
	@FindBy(xpath="//*[@alt=\"free crm publisher logo\"]")
	WebElement CRM_img;
	
	@FindBy(xpath="//*[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")
	WebElement login_button;
	
	@FindBy(xpath="//*[@class=\"btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30\"]")
	WebElement signup_button;
	
	
	//Initialization
	
	public CRMPage() {
		PageFactory.initElements(wd, this);
	}
	
	//Actions
	
	public String getPageTitle() {
		return wd.getTitle();
	}
	
	public boolean getimg() {
		return CRM_img.isDisplayed();
	}
	
	public LoginPage openLoginPage() {
		login_button.click();
		return new LoginPage();
	}
	
	public SignupPage openSignupPage() {
		signup_button.click();
		return new SignupPage();
	}
	
	

}
