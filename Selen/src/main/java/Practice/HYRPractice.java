package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYRPractice {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverWait wait;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//button[@id=\"newTabBtn\"]")).click();
//	
//		Set<String> window=driver.getWindowHandles();
//		Iterator<String>it=window.iterator();
//		String Parent =it.next();
//		String Child=it.next();
//		
//		driver.switchTo().window(Child);
//		
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		
//		System.out.println("Click Successfully");
//		
//		Alert alert= driver.switchTo().alert();
//		
//		alert.accept();
//		
//		driver.switchTo().window(Parent);
//		
//		System.out.println("Home page getting successfully");
//		
		//Farme Practice***
		
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.manage().window().maximize();
////		driver.switchTo().frame("frm1");
////		System.out.println("switch to frame succsesfully");
////		
////		Select select=new Select(driver.findElement(By.xpath("//select[@id='course']")));
////		select.selectByValue("java");
//	     
//		driver.switchTo().frame("frm2");
//		
//		System.out.println("switch to frame succsesfully");
//		
//		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Aniket");
//		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("dapurkar");
//		driver.findElement(By.xpath("//input[@id=\"femalerb\"]")).click();
//		driver.findElement(By.xpath("//input[@id=\"englishchbx\"]")).click();
//		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Aniket@gmail.com");
//		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abcdfgh");
//		
//		System.out.println("info entered succsesfully");
		
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		
//		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"btn1\"]")));
//		
//		
//		driver.findElement(By.xpath("//button[@id=\"btn1\"]")).click();
//		
//		System.out.println("succsesfully");
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys("cndnd");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("asd@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("asadsfsdsd");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("asadsfsdsd");
		driver.findElement(By.xpath("(//button[@type='reset'])[1]")).click();
		
		System.out.println("info clear");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();

		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
	}

}
