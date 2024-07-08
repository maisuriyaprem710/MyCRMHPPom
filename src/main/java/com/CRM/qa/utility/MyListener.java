package com.CRM.qa.utility;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

import com.CRM.qa.base.TestBase;

public class MyListener extends TestBase implements WebDriverListener{

	
	
	public void beforeClick(WebElement element) {
		System.out.println("Trying to click on: " + element);
	}
	
	public void afterClick(WebElement element) {
		System.out.println("Clicked on: " + element);
	}
	
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before navigating to: '" + url + "'");
    }
	
	public void afterGet(WebDriver driver, String url) {
		System.out.println("Navigated to:'" + url + "'");
	}
	
	public void onError(Throwable error, WebDriver driver) {
		System.out.println("Exception occured: " + error);
		try {
			TestUtil.takeScreenShot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
