package com.TestScripts;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_classes.TestBase;
import com.pages.LoginPage;

public class TestLogin extends TestBase {
	
 WebDriver driver;

 LoginPage page;

   @Test
    public void main()
   {
	 page = new LoginPage(driver);
		
		//String title =  page.getTitle();
		
		 // Putting an assertion to verify text on main page.
	  //Assert.assertTrue(title.contains("flipkart"));
		
		page.login("arunpopli@rocketmail.com", "satnamwaheguru");
		
	  String homepagetitle = page.homepagetitle();
	  
	  // Verify user login
	  AssertJUnit.assertTrue(homepagetitle.contains("Hi arunpopli@!"));
	  
	}
   
   
}
	  
	
	
		
		
		
		 
		
		
		
		
		
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	  
  

	
	
	


