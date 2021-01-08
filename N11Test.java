import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N11Test {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.navigate().to("https://www.n11.com/");//Gidilecek Sayfa
		Thread.sleep(1000);//Kullanmak doðru deðil ama sayfa yüklendikten sonra
		clickElement(By.xpath("//*[@id=\"userKvkkModal\"]/div/div[2]/span"));//çýkan kvkk metnine tamam demek için bunu kullanmak gerekli
		clickElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]"));//Link text yerine xpath kullandým
		sendKeys(By.id("email"), "Deneme00@gmail.com11");//hatalý gmail gridim //Doðru sifre mail ile giris yaptýðýmda sistem engel atýyor
		sendKeys(By.id("password"), "sifre");//olmayan maile sifre
		clickElement(By.id("loginButton"));//login butona týklama 
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
