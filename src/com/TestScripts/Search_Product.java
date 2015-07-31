package com.TestScripts;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base_classes.TestBase;
import com.base_classes.TestBase.locators;
public class Search_Product extends TestBase {
	
	  
	@Test
	public void Search_Product() throws InterruptedException
	
	{
		
		 getElement(locators.xpath,"//*[@id='fk-top-search-box']").sendKeys("mobile");
		 
		 getElement(locators.xpath,"//*[@id='fk-header-search-form']/div/div/div[2]/input[1]").click();
		 
		 Thread.sleep(2000l);
		 
		 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
