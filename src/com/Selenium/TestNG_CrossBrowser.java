package com.Selenium;

import org.testng.annotations.Test;

public class TestNG_CrossBrowser extends BaseClass {

	@Test
	private void chrome() {
		launchBrowser("Chrome");
		launchURL("www.gooogle.com");
	}
	private void Edge() {
		launchBrowser("Edge");
		launchURL("www.google.com");

	}
}
