package SeleniumPractice.EcommersProject;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String Productname="ZARA COAT 3";

		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://rahulshettyacademy.com/client");
		 
		driver.manage().window().maximize();
		
		Landing landing=new Landing(driver);
		landing.goTo();
		landing.loginApplication("dapurkar.aniket@gmail.com", "Aniket*123");
		
//		driver.findElement(By.id("userEmail")).sendKeys("dapurkar.aniket@gmail.com");
//		
//		driver.findElement(By.id("userPassword")).sendKeys("Aniket*123");
//		
//		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(Productname)).findFirst().orElse(null);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("#toast-container"))));
		

		driver.findElement(By.xpath("(//button[contains(@class,'btn-custom')])[3]")).click();
	
	
		List<WebElement>CarSection=driver.findElements(By.cssSelector(".cartSection h3"));
		
		Boolean match=CarSection.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(Productname));
	     
		Assert.assertTrue(match);
		
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		driver.findElement(By.cssSelector("[placeholder=\"Select Country\"]")).sendKeys("India");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click(); 	
		
		
		
		WebElement placeorder=driver.findElement(By.xpath("//a[normalize-space()='Place Order']"));
		Actions action=new Actions(driver);
		
		action.click(placeorder);
		
		
		
		String confirmmessage= driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertEquals("confirmmessage", "THANKYOU FOR THE ORDER.");
	}

}
