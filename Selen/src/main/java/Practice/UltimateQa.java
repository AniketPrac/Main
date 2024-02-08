package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UltimateQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parent=it.next();
		String Child=it.next();
		
		driver.switchTo().window(Child);
		
		System.out.println("its works");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='navigateHome']")).click();
		
		System.out.println("HomePage");

	}

}
