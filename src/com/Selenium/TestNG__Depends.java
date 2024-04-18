package com.Selenium;

import org.testng.annotations.Test;

public class TestNG__Depends {

	@Test
	private void browser() {
		System.out.println("browser");
//		throw new NullPointerException();
	}
	@Test(dependsOnMethods = "browser" )
	private void url(){
		System.out.println("URL");
	}
	@Test(description = "Enter Login Credentials")
	private void login() {
		System.out.println("login");
	}
	
	
}
