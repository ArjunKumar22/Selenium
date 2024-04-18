package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=14621899133093913949&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061952&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		    WebElement srchbox = driver.findElement(By.id("twotabsearchtextbox"));
		    srchbox.sendKeys("Iphones");
		    WebElement srchbtn = driver.findElement(By.id("nav-search-submit-button"));
		    srchbtn.click();
		    
		
			
			
	}

}
