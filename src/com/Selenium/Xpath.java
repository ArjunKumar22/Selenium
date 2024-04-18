package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("(//td[text()='Afghanistan']/following::td)[1]")).getText();
		System.out.println(text);
		

	}

}
