package com.TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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

public class Order_Track extends TestBase {

	@Test
	public void Order_Track() throws InterruptedException, AWTException

	{

		getElement(locators.linktext, "Track Order").click();

		Thread.sleep(8000l);

		getElement(locators.xpath,
				"//*[@id='recent-orders-tab']/div/div[2]/div[1]/a").click();

		String mainwindow = driver.getWindowHandle(); // current main window

		Set s = driver.getWindowHandles();

		Iterator itr = s.iterator();

		String childwindow = null;

		while (itr.hasNext()) {

			childwindow = itr.next().toString();

		}

		driver.switchTo().window(childwindow);

		driver.switchTo().defaultContent();
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_D);

		driver.quit();

	}

}
