package com.Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	private void settingproperty() {
		System.out.println("property");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser");
	}
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	@Test
	private void mobile() {
		System.out.println("Mobile");
	}
	@Test
	private void Dress() {
		System.out.println("Dress");
		}
	@Test
	private void cycle() {
		System.out.println("cycle");
	}
	@AfterMethod
	private void logout() {
		System.out.println("log out");
		
	}
	@AfterClass
	private void Screeenshot() {
		System.out.println("Takes Screenshot");
		
	}
	@AfterTest
	private void closeTab() {
		System.out.println("closing tab");
	}
	@AfterSuite
	private void exit() {
		System.out.println("exit browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
