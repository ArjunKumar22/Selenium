package com.Selenium;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Ignore {
	@Test(enabled = false)
	private void chrome() {
		System.out.println("chrome");
	}
	@Test
	private void opera() {
		System.out.println("opera");
		
	}
	@Test
	@Ignore
	private void firefox() {
		System.out.println("firefox");
	}
	
}
