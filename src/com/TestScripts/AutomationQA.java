package com.TestScripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomationQA {
	
	@Test
	
	public void main() throws InterruptedException
	{
		boolean isalertPresent = false;
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
	    Select select  =  new Select(driver.findElement(By.id("selenium_commands")));
	    
	      try
	      {
	     WebDriverWait wait = new WebDriverWait(driver,10);
	     
	     wait.until(ExpectedConditions.alertIsPresent());
	     
	   Alert alert =    driver.switchTo().alert();
	   
	   alert.accept();
	      }
	      
	      
	     catch(Exception e)
	     {
	    	 
	    	 System.out.println("Alert is not present");
	    	 
	    	 
	     }
	   
	     
	     
	     
	     
	     
	    
	    
	    
	    
	    
	    
	        
	         
	        
	               
	    
	         
	       
	      
	    
	  
	    
	   
	    
	    
	       
		
		
	}
	

}
