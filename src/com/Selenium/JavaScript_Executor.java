package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.className("_3I5N7v"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
//		driver.navigate().to("https://www.google.co.in/");
//		WebElement jclick = driver.findElement(By.name("q"));
//		js.executeScript("arguments[0].value='MSD';",jclick);
//		WebElement element2 = driver.findElement(By.className("gNO89b"));
//		js.executeScript("arguments[0].click()",element2);
//		
		
		
		
		

	}

}
