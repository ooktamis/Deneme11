import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N11Test {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.navigate().to("https://www.n11.com/");//Gidilecek Sayfa
		Thread.sleep(1000);//Kullanmak do�ru de�il ama sayfa y�klendikten sonra
		clickElement(By.xpath("//*[@id=\"userKvkkModal\"]/div/div[2]/span"));//��kan kvkk metnine tamam demek i�in bunu kullanmak gerekli
		clickElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]"));//Link text yerine xpath kulland�m
		sendKeys(By.id("email"), "Deneme00@gmail.com11");//hatal� gmail gridim //Do�ru sifre mail ile giris yapt���mda sistem engel at�yor
		sendKeys(By.id("password"), "sifre");//olmayan maile sifre
		clickElement(By.id("loginButton"));//login butona t�klama 
		Thread.sleep(3000);
	
		driver.quit();
	}
	public static WebElement findElement(By by) {
		return driver.findElement(by);
	}
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void sendKeys(By by, String text) {
		findElement(by).sendKeys(text);
	}
	public static void clickElement(By by) {
		findElement(by).click();
	}
}
