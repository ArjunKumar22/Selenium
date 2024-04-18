package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mdrop_down {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement multiple = driver.findElement(By.id("colors"));
		Select S=new Select(multiple);
		S.selectByIndex(0);
		Thread.sleep(2000);
		S.selectByValue("blue");
		Thread.sleep(2000);
		S.selectByVisibleText("Green");
//		Thread.sleep(5000);
//		S.deselectByIndex(0);
//		Thread.sleep(2000);
//		S.deselectByValue("blue");
//		Thread.sleep(2000);
//		S.deselectByVisibleText("Green");
		Thread.sleep(2000);
		List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println("All selected Options:"+webElement.getText());
		}
		List<WebElement> options = S.getOptions();
		for (WebElement webElement1 : options) {
			System.out.println("All Options:"+webElement1.getText());
		}
		Thread.sleep(2000);
		WebElement firstSelectedOption = S.getFirstSelectedOption();
		System.out.println("First Option Selected:"+firstSelectedOption.getText());
		Thread.sleep(2000);
		S.deselectAll();

		
		
		
		
		
		
		
		
		
	}

}
