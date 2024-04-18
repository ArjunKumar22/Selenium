package com.Selenium;
import org.testng.annotations.Test;

public class TestNG_Invocation {
	@Test(invocationCount = 2)
	private void chrome() {
		System.out.println("chrome");
	}
	@Test(invocationCount = 3)
	private void opera() {
		System.out.println("opera");
		
	}
	@Test(invocationCount = 3, invocationTimeOut = 1000)//no.of times should run within the given milliseconds otherwise timeout error
	private void firefox() {
		System.out.println("firefox");
	}
}
