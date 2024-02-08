package SeleniumPractice.EcommersProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing {

	WebDriver driver;

	public Landing(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// driver.findElement(By.id("userEmail")).sendKeys("dapurkar.aniket@gmail.com");
	@FindBy(id = "userEmail")
	WebElement userEmail;

	// driver.findElement(By.id("userPassword")).sendKeys("Aniket*123");

	@FindBy(id = "userPassword")
	WebElement password;

	// driver.findElement(By.id("login"))

	@FindBy(id = "login")
	WebElement submit;

	public void loginApplication(String Email,String passwords) {
		
		userEmail.sendKeys(Email);
		password.sendKeys(passwords);
		
		submit.click();

	}
	
	public void goTo() {
		
		driver.get("https://rahulshettyacademy.com/client");
		
	}

}