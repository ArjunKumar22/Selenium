package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a=new Actions(driver);
		//by className
		WebElement grocery = driver.findElement(By.cssSelector("span._27h2j1"));
		a.moveToElement(grocery).perform();
		Thread.sleep(5000);
		//by any Attribute
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("mobile");
		//by Match with prefix
		driver.findElement(By.cssSelector("[title^=Search ]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element1 = driver.findElement(By.className("_213eRC _2ssEMF"));
		js.executeScript("argument[0].scrollIntoView();", element1);
		a.click(element1).perform();
		
		
		
		
	}

}
