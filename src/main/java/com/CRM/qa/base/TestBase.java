package com.CRM.qa.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import com.CRM.qa.utility.MyListener;
import com.CRM.qa.utility.TestUtil;






public class TestBase {

	public static WebDriver wd;  // Global variables
	public static Properties prop;
	
    public static WebDriverListener listener;

	
	public TestBase() {
		
	try {
		prop = new Properties();
	    FileInputStream fi = new FileInputStream("C:\\QA\\eclipse-workspace\\MyCRMHpPOM\\src\\main"
	    		+ "\\java\\com\\CRM\\qa\\config\\config.properties");
		prop.load(fi);
	    }catch(FileNotFoundException e) {
	    	e.printStackTrace();
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	}
	
	
	public static void initailization() {
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\QA\\driver for browsers\\chromedriver-win64\\chromedriver.exe" );   //Chrome Driver path : ""C:\QA\driver for browsers\chromedriver-win64\chromedriver.exe""
			wd = new ChromeDriver();
		}else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\driver for browsers\\geckodriver.exe"); // Firefox(Geckodriver) path : "C:\QA\driver for browsers\geckodriver.exe"
			wd = new FirefoxDriver();
		}
		
//		e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;
		
		listener = new MyListener();
		WebDriver driver = new EventFiringDecorator<WebDriver>(listener).decorate(wd);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEPOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITE_TIMEPOUT));
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
}
