package com.Selenium;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.poma.PageObjectManager;

public class Runner extends BaseClass{
	
    public static PageObjectManager pom = new PageObjectManager();
    
 
	public static void main(String[] args) throws InterruptedException  {
		// Login Page
			launchBrowser("chrome");
			launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			implicitlyWait(30, TimeUnit.SECONDS);
			sendKeys(pom.getlp().getUsername(), "Admin");
			sendKeys(pom.getlp().getPassword(), "admin123");
			click(pom.getlp().getLogin());
		// Create Account
			click(pom.getCu().getAdminbutton());
			aClick(pom.getCu().getAddbutton());
			click(pom.getCu().getUserrole());
			keyPressRelease(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
			keyPressRelease(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
			click(pom.getCu().getStatus());
			keyPressRelease(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
			keyPressRelease(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
//			String Employee = pom.getCu().getEmployeeName().getText();
			sendKeys(pom.getCu().getEmployee(), "Dont Change Please");
			Thread.sleep(3000);
			keyPressRelease(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
			keyPressRelease(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
			sendKeys(pom.getCu().getUsername(), "Peter");
			sendKeys(pom.getCu().getPassword(), "Mj@2001");
			sendKeys(pom.getCu().getPassword1(), "Mj@2001");
			click(pom.getCu().getCreate());
			
	}
	

	
}
