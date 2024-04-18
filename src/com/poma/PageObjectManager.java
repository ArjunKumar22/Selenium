package com.poma;

import com.Selenium.BaseClass;
import com.pom.LoginPage;
import com.pom.UserAccount;

public class PageObjectManager extends BaseClass{
	
	private LoginPage lp;
	private UserAccount cu;
	
	public UserAccount getCu() {
		if(cu==null) {
			cu=new UserAccount(driver);
		}
		return cu;
	}

	public LoginPage getlp() {
		if (lp==null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	
}
