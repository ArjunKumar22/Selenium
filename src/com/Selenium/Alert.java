package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		element.click();
		Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Ron");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        
        
        
        
	}

}
