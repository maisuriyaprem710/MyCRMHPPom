package com.CRM.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//body/div[4]/div[1]/i[1]")
	WebElement close_popup_button; 
	
	@FindBy(xpath="//span[@class=\"user-display\"]")
	WebElement user_label;
	
	@FindBy(xpath="//i[@class=\"home icon\"]")
	WebElement home_button;
	
	@FindBy(xpath="//i[@class=\"users icon\"]")
	WebElement contacts_button;
	
	@FindBy(xpath="(//i[@class=\"settings icon\"])[1]")
	WebElement setting_button;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(wd, this);
	}
	
	
	public String getPageTitle() {
		return wd.getTitle();
	}
	
	public void closeAlertScreen() {
		close_popup_button.click(); // Closing alert
		
	}
	
	public String getUserAccount() {
		return user_label.getText();
	}
	
	public ContactsPage openContact() {
		contacts_button.click();
		return new ContactsPage();
	}
	
	public void openSetting() {
		setting_button.click();
	}
	
	public HomePage clickHomebutton() {
		home_button.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
}
