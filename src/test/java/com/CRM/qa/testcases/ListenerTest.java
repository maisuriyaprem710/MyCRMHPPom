package com.CRM.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.CRM.qa.utility.MyListener;

public class ListenerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		
		WebDriverListener listener = new MyListener();
		
		WebDriver wb = new EventFiringDecorator<WebDriver>(listener).decorate(driver);
		
		wb.get("https://www.facebook.com/");
	}

}
