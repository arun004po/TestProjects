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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base_classes.TestBase;
import com.base_classes.TestBase.locators;
import com.pages.LogoutPage;
import com.thoughtworks.selenium.webdriven.Windows;


public class Logout{
	WebDriver driver;
	LogoutPage logout;
  @Test
	public void setup()
	{
		
       driver = new FirefoxDriver();
		
		//driver.get("http://www.flipkart.com/");
       
       
       
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	public void logout() throws InterruptedException
	{
		 
     logout = new LogoutPage(driver);
     
        logout.logout();
  	
  	}}
  	
  	
      
      
		
	
   
   
	
	

	
	
	
	
	
	
	
	          
	
	 
	     
	     
	   
	     
	     
	     
	     
	     
	
	 
	
	 
