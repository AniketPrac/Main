package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriver driver; 
		 
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aniket\\Desktop\\chrome driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		  //driver = new FirefoxDriver();
		 
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Aniket\\Desktop\\chrome driver\\new\\chromedriver_win32 (7)//chromedriver.exe");
         
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
	}

}
