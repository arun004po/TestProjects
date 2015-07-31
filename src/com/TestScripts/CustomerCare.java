package com.TestScripts;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;





import com.base_classes.TestBase;
import com.thoughtworks.selenium.webdriven.Windows;

public class CustomerCare extends TestBase {
	
	
	
	@Test
	public void login()  throws InterruptedException
	{
	  driver = new FirefoxDriver();
	  driver.get("http://www.flipkart.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  getElement(locators.xpath,"//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[3]/a");
	  
		
		

	}}
	
	 
