package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {

	@Test
	public void loginForm() throws InterruptedException {
		clickElement(By.xpath("//*[@id=\"userKvkkModal\"]/div/div[2]/span"));
		clickElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]"));
		sendKeys(By.id("email"), "Deneme00@gmail.com11");
		sendKeys(By.id("password"), "sifre");
		
		clickElement(By.id("loginButton"));
		Thread.sleep(300);
	}
	
}
