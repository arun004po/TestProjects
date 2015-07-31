package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_classes.TestBase.locators;

public class LoginPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/a")
	
	WebElement loginlink;
	
	
   @FindBy(xpath ="//*[@id='login_email_id']")
	
	WebElement loginusername;
	
	
   @FindBy(xpath ="//*[@id='login_password']")
	
  	WebElement loginpassword;
   
   @FindBy(xpath = "//*[@id='login-form']/div[3]/div[2]/input[2]")
   WebElement btnlogin;
   
   @FindBy(xpath = "//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img")
   WebElement getTitle;
   
   @FindBy(xpath = ".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/a")
   WebElement homepagetitle;
   
   
   
   
	public LoginPage(WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	// click on loginlink
	public void clickonlogin()
	{
		loginlink.click();
	}
	
	
	// setting username
	public void setUserName(String username)
	{
		
		loginusername.sendKeys(username);
		
	}
	
	
	// setting password
	public void setPassword(String password)
	{
		
		 loginpassword.sendKeys(password);
		 
	}
	
	
	// click on loginlink
	public void loginbtn()
	{
		btnlogin.click();
	}
		
	// getTitle to verify loginpage
    public String getTitle()
    {
    	return getTitle.getText();
    }
	
    
    public String homepagetitle()
    {
   
    	return homepagetitle.getText();
    	
    }
	
	
	public void login(String username, String password)
	{
		
		
		this.clickonlogin();
		this.setUserName(username);
		this.setPassword(password);
		this.loginbtn();
		
	}
		
		
	
	
	
	 
	 
		
		
	
	
	  
	  
	 
		
		

}
 