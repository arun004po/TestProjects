package com.base_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver = null;
	public static Properties OR = null;
	public static Properties config = null;
	
	public enum locators {

		id, xpath, tagname, name, linktext

	}   
	
	public enum browsers
	{
		
		firefox,
		InternetExplorer,
		Chrome
	}
	@BeforeSuite
	public void initialize() throws IOException {
         
		config = new Properties();
	   // FileInputStream fp = new FileInputStream(System.getProperty("user.dir" + ""));
       //config.load(fp);  // loading config file
        
        driver = new FirefoxDriver();
       // Actions action = new Actions(driver);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("http://www.flipkart.com");
         driver.manage().window().maximize();
         
	}
         
            
    public static WebDriver getBrowser(browsers browserType)  // 
        {
        
        driver = null;
        switch(browserType)
        {
        case firefox:
        {
        	
        	driver = new FirefoxDriver();
        	break;
		    
		   
        }
        
        case InternetExplorer:
        {
        	
        	File file = new File("E:\\Workspace\\Flipkart\\src\\InputTestData\\IEDriverServer.exe");
		    System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		    driver = new InternetExplorerDriver();
        }
        
        case Chrome:
        {
        
         File file =  new File("E:\\Workspace\\Flipkart\\src\\InputTestData\\chromedriver.exe");
   		  System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
   		  driver = new ChromeDriver();
        }
        }
    	

		
		return driver;
		
	}
        
        
	public static WebElement getElement(locators locator, String value) {

		WebElement e = null;
		try {

			switch (locator) {

			case id: {

				e = driver.findElement(By.id(value));
				break;
			}

			case xpath: {

				e = driver.findElement(By.xpath(value));
				break;
			}

			case name: {

				e = driver.findElement(By.name(value));
				break;

			}

			case tagname: {

				e = driver.findElement(By.tagName(value));
				break;
			}
			
			case linktext:
			{
				
				e = driver.findElement(By.linkText(value));
			}

			}
			return e;
		}

		catch (Throwable t) {

			System.out.println("Error in WebElement  " + t.getLocalizedMessage());

		}
		return e;

	}

	private static void hideKeyboard() {

		driver.navigate().back();
	}
}




  
