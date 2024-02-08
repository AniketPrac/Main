package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Aniket\\Desktop\\chrome driver\\new\\chromedriver_win32 (7)//chromedriver.exe");

		 driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 
		 driver.manage().window().maximize();		 
		 //Relative locators are
		 // Above()
		 //Blow();
		 //torightof();
		 //toleftof();
		 
		 //Above
		 WebElement nameEditbox=driver.findElement(By.cssSelector("[minlength=\"2\"]"));
		 
	     System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
	     
	     
	     //Below
	     
	     WebElement Below=driver.findElement(By.cssSelector("[name=\"email\"]"));
	     
	    String name= driver.findElement(with(By.tagName("label")).below(Below)).getText();
	    
	    System.out.println(name);
	    
	    //toleftof
	    WebElement LeftOf=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	    
	    driver.findElement(with(By.tagName("input")).toLeftOf(LeftOf)).click();
	    
	    //torightof
	    
	    WebElement aboveRight=driver.findElement(By.id("inlineRadio1"));
	    
	    String name2=driver.findElement(with(By.tagName("label")).toRightOf(aboveRight)).getText();
	    System.out.println(name2);
	    
	}

}
