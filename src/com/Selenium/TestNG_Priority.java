package com.Selenium;
import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(priority = 5)
	private void chrome() {
		System.out.println("chrome");
	}
	@Test(priority = -5)
	private void opera() {
		System.out.println("opera");
		
	}
	@Test(priority = 0)
	private void firefox() {
		System.out.println("firefox");
	}
	
	
	
}
