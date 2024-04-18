package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccount {

	public WebDriver driver;
	
	@FindBy(className = "oxd-main-menu-item")
	private WebElement Adminbutton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement Addbutton;
	
	@FindBy(xpath ="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userrole;

	@FindBy(xpath="(//div[@class='oxd-select-text--after'])[2]")
	private WebElement status;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement EmployeeName;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement Employee;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	private WebElement username;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password1;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement create;

	public UserAccount(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdminbutton() {
		return Adminbutton;
	}

	public WebElement getAddbutton() {
		return Addbutton;
	}

	public WebElement getUserrole() {
		return userrole;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getEmployeeName() {
		return EmployeeName;
	}

	public WebElement getEmployee() {
		return Employee;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getCreate() {
		return create;
	}
	
//	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
//	private WebElement username1;
//	
//	@FindBy(xpath="((//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
//	private WebElement userrole1;
//	
//	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
//	private WebElement status1;
	
	
	
	
	
}
