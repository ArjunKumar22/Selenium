package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MiniP_Explain {
	
		public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//getting username and password indirectly
			String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
			String text2 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
			//passing user credentials
			driver.findElement(By.name("username")).sendKeys(text.substring(11));
			driver.findElement(By.name("password")).sendKeys(text2.substring(11));
			//click login button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//click admin button
			driver.findElement(By.className("oxd-main-menu-item")).click();
			//Using Actions Class to click the Add to create a account 
			Actions a=new Actions(driver);
			WebElement Add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
			a.click(Add).perform();
			//giving required details to create a account
			driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
			//Using Robot Class because element hides while inspecting
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//getting the text of the Employee name from the Web page 
			String Employee = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
			//Entering the Text which we get from web page
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employee);
			
			Thread.sleep(3000);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//Entering User name and Password
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("JamesBond");
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("JamesBond@007");
			driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("JamesBond@007");
			driver.findElement(By.xpath("//button[@type='submit']")).click(); 
			//our account is created now
		    Thread.sleep(10000);
			//used to wait until the next web page loads
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("JamesBond");
			driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			WebElement arrow = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
			a.click(arrow).perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			////selecting the radio button of user box in the accounts created list
			WebElement verify = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]"));
			a.click(verify).build().perform();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")).click();
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			//deleting our created account
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			//logging out
			WebElement LogOut = driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]"));
			Thread.sleep(5000);
			a.click(LogOut).build().perform();
			Thread.sleep(10000);
            
			driver.quit();
			
		
			
			
			
			
			
		}

	}


