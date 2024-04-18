package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/advancedtable");
		List<WebElement> all = driver.findElements(By.xpath("//table[1]/tbody/tr/td"));
		for (WebElement All : all) {
			System.out.println(All.getText());
		}
		List<WebElement> row2 = driver.findElements(By.xpath("//table[1]/tbody/tr[2]/td"));
		for (WebElement Row2 : row2) {
			System.out.println(Row2.getText());
		}
		List<WebElement> column1 = driver.findElements(By.xpath("//table[1]/tbody/tr/td[1]")); 
		for (WebElement Column1 : column1) {
			System.out.println(Column1.getText());
		}
		WebElement onedata = driver.findElement(By.xpath("//table[1]/tbody/tr[3]/td[3]"));
		System.out.println(onedata.getText());
	    List<WebElement> header = driver.findElements(By.xpath("//th"));
	    for (WebElement Header : header) {
			System.out.println(Header.getText());
		}
		
		
		
	}

}
