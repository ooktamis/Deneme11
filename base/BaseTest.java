package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Browser;

public class BaseTest {
	
	
	static WebDriverWait wait;
	private static WebDriver driver;
	protected static Browser browser = new Browser();
	
	
	@Before
	public void baslat() {
		System.out.println("iþlem yapýlacak");
		browser.setBrowser("https://www.n11.com/");
	}
	@After
	public void sonlandir() { 
		System.out.println("iþlem Sonlandý");
		getDriver().close(); }
	
	public static WebDriver getDriver() { return driver;}
	
	public static void setDriver(WebDriver driver) { BaseTest.driver= driver; }
	
	public static WebDriverWait  Webwait (WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
		return wait;
	}
	
	public static WebElement findElement(By by) { return driver.findElement(by); }
	
	public static void sendKeys(By by, String text) { findElement(by).sendKeys(text); }
	
	public static void clickElement(By by) { findElement(by).click(); }
}
