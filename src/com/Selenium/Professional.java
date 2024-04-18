package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Professional {
	private static void Iniatilizingbrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/shoes?rawQuery=shoes");

	}
	private static void gettingAllPrices(){
//	   driver.findelements(By.xpath("//a[@data-refreshpage='true']/descendant::span[@class='product-strike']"))
		
		
		
		
	}
	
	

}
