package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

	 public class DownloadPage {
		 
		    WebDriver driver;

	 	    @FindBy(xpath ="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/ul/li[7]/a")
	 		WebElement downloadapp;
	 	    
	 	    @FindBy(xpath = "//*[@id='ios-btn-cont']/a" )
	 	    WebElement _iosdownload;
	 	    
	 	    @FindBy(xpath ="//*[@id='android-btn-cont']/a")
	 	    WebElement _androiddownload;
	 	    
	 	    @FindBy(xpath ="//*[@id='windows-btn-cont']/a/div[2]/div")
	 	    WebElement _windowsdownload;
	 	    
	 	    
	 	    public DownloadPage(WebDriver driver)
	 	    {
	 	    	this.driver = driver;
	 	    	PageFactory.initElements(driver, this);
	 	    	
	 	    }
	 	    // downloadapp link
	 	    public void downloadpp()
	 	    {
	 	    	downloadapp.click();
	 	    	
	 	    }
	 	    
	 	    public void iosdownload()
	 	    {
	 	    	
	 	    	_iosdownload.click();
	 	    }
	 	    
	 	    public  void androiddownload()
	 	    {
	 	    	
	 	    	_androiddownload.click();
	 	    }
	 	    
	 	    public void windowsdownload()
	 	    {
	 	    	_windowsdownload.click();
	 	      
	 	    }
	 	    
	 	    
	 	    
	 }
	 	    
	 	    
	 	    
	 			

	 		  
	 		   
	 	    
	 	    

	 		  
	 		
	 		
	 		
	 		
	        
	        

	 		

	 	



		

	


