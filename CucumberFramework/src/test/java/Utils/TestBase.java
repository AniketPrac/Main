package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebdriverManager() {

		if (driver == null) {
			
			System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\Chrome1\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		}
		return driver;

	}
}
