package com.Selenium;

import org.openqa.selenium.WebDriver;

public class Trial {
	public Trial(WebDriver driver) {

	}

	private void Constructor(int a) {
		System.out.println("main:" + a);
	}

	public Trial() {
		System.out.println("Constructor");
	}
	public Trial(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Trial one = new Trial();
		one.Constructor(12);
		
	}
}
