package OrangeHrmServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsLogin {
	
	public static void main(String args[]) throws InterruptedException {
		
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(1000);
;		  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  
		    boolean  UserId=driver.findElement(By.xpath("//p[text()='Paul Collings']")).isDisplayed();
		    
		    System.out.println(UserId);
		    
		    if(UserId) {
		    	
		    	System.out.println("User Id displayed succsefully");
		    }else {
		    	
		    	System.out.println("User id is not displayed");
		    }
		  
	}
		  
}
