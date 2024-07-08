package com.CRM.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="(//i[@class=\"edit icon\"])[1]")
	WebElement create_button;
	
	@FindBy(xpath="//table[@class=\"ui celled definition sortable striped table custom-grid\"]//tbody//tr")
	List <WebElement> rows;
	
	@FindBy(xpath="//i[@class=\"home icon\"]")
	WebElement home_button;
	
	
	public ContactsPage() {
		PageFactory.initElements(wd, this);
	}

	public String getTitle() {
		return wd.getTitle();
	}
	
	public boolean createbuttonPresence() {
		return create_button.isDisplayed();
		
	}
	
	public int getNoOfContacts() {
		return rows.size();
	}
	
	public HomePage openHomepgae() {
		home_button.click();
		return new HomePage();
	}
	
	public void createNewContact(String firstname,String last_name,String department, String position){
		create_button.click();
		wd.findElement(By.name("first_name")).sendKeys(firstname);
		wd.findElement(By.name("last_name")).sendKeys(last_name);
		wd.findElement(By.name("department")).sendKeys(department);
		
		wd.findElement(By.name("position")).sendKeys(position);
		wd.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
		
		
		
		
}
	
	
}
