package com.TestScripts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

    public class All_Links {
	private static String[] links = null;
	public static WebDriver driver = null;

	@Test
	public void alllinks() throws InterruptedException

	{
		 driver = null;

		      List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		       String linktexts[] = new String [linkElements.size()];  // string array
		       
		        int i = 0;
		         for(WebElement e: linkElements)
		         {
		        	 linktexts [i] =    e.getText();
		        	 i++;
		         }
		         
		         
		         for(String t: linktexts)
		         {
		         
		        	 driver.findElement(By.linkText(t)).click();
		        	 driver.navigate().back();
		         }
		      
		      
		      Thread.sleep(2000l);
		

		

			
		
	}
}
