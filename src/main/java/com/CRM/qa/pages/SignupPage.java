package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class SignupPage extends TestBase{

	
	@FindBy(id="submitButton")
	WebElement submit_button;
	
	@FindBy(id="email")
	WebElement email_box;
	
	@FindBy(linkText="Got an account? Log in here")
	WebElement loginpage_button;
	
	
	public SignupPage() {
		PageFactory.initElements(wd, this);
	}
	
	public String getPagetitile() {
		return wd.getTitle();
	}
	
	public LoginPage openLoginPage() {
		loginpage_button.click();
		return new LoginPage();
	}
	
	
	
}
