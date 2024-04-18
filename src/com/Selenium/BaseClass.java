package com.Selenium;

import java.awt.AWTException;
import java.awt.peer.RobotPeer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

// 1.Initializing browser    

	public static WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

// 2.Close tab

	public static WebDriver close() {
		driver.close();
		return driver;

	}

// 3.Quit

	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

// 4.Enter URL

	public static WebDriver launchURL(String URL) {
		try {
			driver.get(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

// 5.Send keys

	public static void sendKeys(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 6.Click element

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 7.Navigate to

	public static WebDriver navigateTo(String URL) {
		driver.navigate().to(URL);
		return driver;
	}

// 8.Navigate back

	public static WebDriver navigateBack() {
		driver.navigate().back();
		return driver;
	}

// 9.Navigate forward

	public static WebDriver navigateForward() {
		driver.navigate().forward();
		return driver;
	}

// 10.Refresh

	public static WebDriver refresh() {
		driver.navigate().refresh();
		return driver;
	}

// 11.Is enabled

	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// 12.Is Displayed

	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 13.Is Selected

	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// 14.Get text

	public static void getText(WebElement element) {
		try {
			element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 15.Get Attribute
	public static void getAttribute(WebElement element, String Attname) {
		try {
			element.getAttribute(Attname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 16.CLear the passed value

	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 17.Get Current URL

	public static WebDriver getURL(String URL) {
		driver.getCurrentUrl();
		return driver;
	}

// 18.Get title

	public static WebDriver getTitle(String URL) {
		driver.getTitle();
		return driver;
	}

// 19.Java script executor 

	public static JavascriptExecutor javascriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

// 20.JS click

	public static void jsClick(WebElement element) {
		try {
			javascriptExecutor().executeScript("arguements[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

// 21.JS passing values

	public static void jsSendkeys(WebElement element, String value) {
		try {
			javascriptExecutor().executeScript("arguement[0].value='" + value + "';", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 22.JS scroll into view

	public static void jsScrollIntoView(WebElement element) {
		try {
			javascriptExecutor().executeScript("arguements[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 23.JS scroll to starting page

	public static void jsScroll() {
		try {
			javascriptExecutor().executeScript("window.scroll(0,0)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 24. JS scroll up and down

	public static void jsScrollUpDown(int up, int down) {
		try {
			javascriptExecutor().executeScript("window.scrollBy(" + up + "," + down + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 25.Dropdown 

	public static Select dropdown(WebElement element) {
		Select S = new Select(element);
		return S;
	}

// 26.Select by index

	public static void selectByIndex(WebElement element, int index) {
		try {
			dropdown(element).selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 27.Select by value

	public static void selectByValue(WebElement element, String value) {
		try {
			dropdown(element).selectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 28.Select by visible text

	public static void selectByVisibleText(WebElement element, String value) {
		try {
			dropdown(element).selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// 29.Deselect By Index
	
	public static void deselectByIndex(WebElement element,int index) {
		try {
			dropdown(element).deselectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// 30.Deselect by value

	public static void deelectByValue(WebElement element, String value) {
		try {
			dropdown(element).deselectByValue(value);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// 31.Deselect by visible text

	public static void deselectByVisibleText(WebElement element, String value) {
		try {
			dropdown(element).deselectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// 32.check whether the dropdown is single or multiple
	
	public static void isMultiple(WebElement element) {
		try {
			dropdown(element).isMultiple();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// 33.Getting all the options from the dropdown
	
	public static void getOptions (WebElement element,List<WebElement> options) {
		try {
			List<WebElement> Options = dropdown(element).getOptions();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// 34.Getting all selected options from the dropdown
	
	public static void getSelectedOptions (WebElement element,List<WebElement> a)  {
		try {
			List<WebElement> allSelectedOptions = dropdown(element).getAllSelectedOptions();
		
		} catch (Exception e)  {
			e.printStackTrace();
		}
	}

// 35.Getting first selected options from the dropdown
	
	public static void getFirstSelectedOption (WebElement element) {
		try {
			dropdown(element).getFirstSelectedOption();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// 36.Deselect all in the dropdown
	
	public static void deselectAll(WebElement element) {
		try {
			dropdown(element).deselectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// Implicitly wait

	public static WebDriver implicitlyWait(int num, TimeUnit Timeunit) {
		try {
			driver.manage().timeouts().implicitlyWait(num, Timeunit);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

// Explicit wait

	public static WebDriver explicitlyWait(int second, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, second);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

// Alert

	public static WebDriver accept() {
		driver.switchTo().alert().accept();
		return driver;
	}

	public static WebDriver dismiss() {
		driver.switchTo().alert().dismiss();
		return driver;
	}

	public static WebDriver sendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
		return driver;
	}

	public static WebDriver getText() {
		driver.switchTo().alert().getText();
		return driver;
	}

// Frame

	public static WebDriver frameElement(WebElement element) {
		driver.switchTo().frame(element);
		return driver;
	}

	public static WebDriver frameName(String id) {
		driver.switchTo().frame(id);
		return driver;
	}

	public static WebDriver frameIndex(int index) {
		driver.switchTo().frame(index);
		return driver;
	}

	public static WebDriver parentFrame() {
		driver.switchTo().parentFrame();
		return driver;
	}

	public static WebDriver defaultFrame() {
		driver.switchTo().defaultContent();
		return driver;
	}

// Action
	public static Actions actions() {
		Actions a = new Actions(driver);
		return a;
	}

// Action class click
	public static void aClick(WebElement element) {
    	 try {
			actions().click(element).build().perform();;
		} catch (Exception e) {
			e.printStackTrace();
		}
     }

// Action class context click
	public static void aContextClick(WebElement element) {
		try {
			actions().contextClick(element).build().perform();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Action class double click
	public static void aDoubleClick(WebElement element) {
		try {
			actions().doubleClick(element).build().perform();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Action class drag and drop
	public static void aMoveToElement(WebElement element) {
		try {
			actions().moveToElement(element).build().perform();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Action class drag and drop
	public static void aDragAndDrop(WebElement from, WebElement to) {
		try {
			actions().dragAndDrop(from, to).build().perform();;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Robot class
	public static java.awt.Robot Robot() throws AWTException {
    	 java.awt.Robot r = new java.awt.Robot();
    	 return r;
     }

	public static void keyPressRelease(int press,int release) {
    	 try {
    		 Robot().keyPress(press);
        	 Robot().keyRelease(release);
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
	

// Window handle
	public static WebDriver windowHandles() {
		String windowHandles = driver.getWindowHandle();
		driver.switchTo().window(windowHandles);
		return driver;
	}
		
// Window handles
	public static WebDriver windowHandles(int index,List<String> wHandles) {
        Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(list.get(index));
		return driver;
	}
	
// Taking Screenshot
	public static void screenShot(String location) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(location);
			FileUtils.copyFile(src, des);
			
		} catch (Exception e) {
	        e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
