package com.CRM.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement username_inbox;

	@FindBy(name="password")
	WebElement password_inbox;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement login_button;
	
	public LoginPage() {
		PageFactory.initElements(wd, this);
	}
	
	public String getPageTitle() {
		return wd.getTitle();
	}
	
	public void enterUsername() {
		username_inbox.sendKeys("ppremm710@gmail.com");
	}
	
	public void enterPassword() {
		password_inbox.sendKeys("Prem@710");
	}
	
	public LoginPage clickLogin() {
		login_button.click();
		return new LoginPage();
	}
	
public HomePage login(String username,String password) {
	username_inbox.sendKeys(username);
	password_inbox.sendKeys(password);
	login_button.click();
	return new HomePage();
	}
}
