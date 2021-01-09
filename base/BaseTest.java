package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Browser;

public class BaseTest {
	

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
	

	
	public static WebElement findElement(By by) { return driver.findElement(by); }
	
	public static void sendKeys(By by, String text) { findElement(by).sendKeys(text); }
	
	public static void clickElement(By by) { findElement(by).click(); }
}
