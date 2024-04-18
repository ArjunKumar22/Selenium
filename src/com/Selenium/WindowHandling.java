package com.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Realme Mobiles");
		driver.findElement(By.xpath("//button[contains(@class,'_2iLD__')] ")).click();
		driver.findElement(By.xpath("//div[contains(text(),'realme C53 (Champion Black, 64 GB)')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		WebElement element = driver.findElement(By.xpath("//div[@class='_2usHgU']"));
		a.moveToElement(element).build().perform();
		
		WebElement element1 = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));
		driver.switchTo().frame(element1);
		
		WebElement element2 = driver.findElement(By.xpath("//button[@title='Play']"));
		a.click(element2).build().perform();
		
		WebElement element3 = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		a.moveToElement(element3).perform();
		Thread.sleep(5000);
		a.click(element3).build().perform();
		
		
		
		
		
		
		
		
		
		
	    
			
		}
		
		
		
		
	
		
	}


