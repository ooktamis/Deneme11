package util;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseTest;

public class Browser {
	public void setBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		BaseTest.setDriver(driver);
		BaseTest.getDriver().navigate().to(url);
		
		
	}

}
