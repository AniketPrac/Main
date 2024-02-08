package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHanddls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverWait wait;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	
//		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
//		
//		String Window=driver.getWindowHandle();
//		
//		System.out.println(Window);
//	
//	  Set<String>Windows1= driver.getWindowHandles();
//	  
//	  Iterator<String> it=Windows1.iterator();
//	  
//	  String Parent=it.next();
//	  String Child=it.next();
//	  
//	  driver.switchTo().window(Child);
//	  
//	  System.out.println("close successfully");
//	  driver.close();
		
		
	  
	}

}
