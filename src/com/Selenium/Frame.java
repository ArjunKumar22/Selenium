package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Ron");
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_0']")).click();
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("12/20/2001");
	    WebElement element = driver.findElement(By.name("RESULT_RadioButton-3"));
		Select S=new Select(element);
		S.selectByValue("Radio-1");
		driver.findElement(By.name("Submit")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
