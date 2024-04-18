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

public class Mini_Project {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
		String text2 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
		driver.findElement(By.name("username")).sendKeys(text.substring(11));
		driver.findElement(By.name("password")).sendKeys(text2.substring(11));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.className("oxd-main-menu-item")).click();
		
		Actions a=new Actions(driver);
		WebElement Add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		a.click(Add).perform();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
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
		String Employee = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employee);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("JamesBond");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("JamesBond@007");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("JamesBond@007");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
////		Thread.sleep(10000);
//		
//		WebElement element = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOf(element));
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.visibilityOf(element));
//		
//		element.sendKeys("JamesBond");
//		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement arrow = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
//		a.click(arrow).perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		WebElement verify = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]"));
//		a.click(verify).build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")).click();
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//		
//		WebElement LogOut = driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]"));
//		Thread.sleep(5000);
//		a.click(LogOut).build().perform();
//		Thread.sleep(10000);
//		driver.quit();
////		
////	
////		
		
		
		
		
	}

}
