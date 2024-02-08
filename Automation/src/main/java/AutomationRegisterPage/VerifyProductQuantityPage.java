package AutomationRegisterPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VerifyProductQuantityPage extends SignUpPage {

	WebDriver driver;
	WebDriverWait wait;

	public VerifyProductQuantityPage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
		

	}
	
	
	
	@FindBy(xpath="//a[@href=\"/product_details/1\"]")
	WebElement ViewProduct;
	
	@FindBy(xpath="//h2[text()='Blue Top']")
	WebElement Productdetails;
	
	@FindBy(xpath="//input[@name=\"quantity\"]")
	WebElement Quantity;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	WebElement Addbutton;
	
	@FindBy(xpath="//u[text()='View Cart']")
	WebElement ViewCart;
	
	@FindBy(xpath="//td[@class=\"cart_quantity\"]")
	WebElement VerifyQuan;
	
	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void ViewProducts() {
		
		ViewProduct.click();
		
		String text=Productdetails.getText();
		Assert.assertEquals(text, "Blue Top");
	}
	
	public void VerifyQuantitys(String Number) {
	
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Quantity));
		element.clear();
		
		Quantity.sendKeys(Number);
	}
	
	public void ClickOnAddButton() {
		
		Addbutton.click();
		ViewCart.click();
	}
	
	public void VerifyQuantity() {
		
		String text=VerifyQuan.getText();
		Assert.assertEquals(text, "4");
	}
}
