package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver driver;
	
   @FindBy(xpath ="//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/ul/li[10]/a")
	
	WebElement logoutlink;
	

	public LogoutPage(WebDriver driver)
	{
	
	    this.driver = driver;
	    PageFactory.initElements(driver,this);
	    
	}
	
	
	public void logout()
	{
		
		logoutlink.click();
	}
	
	
	
	

		
		
		
		
	

}
