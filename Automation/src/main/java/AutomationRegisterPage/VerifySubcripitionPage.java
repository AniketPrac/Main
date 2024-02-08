package AutomationRegisterPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifySubcripitionPage extends SignUpPage {

	WebDriver driver;

	public VerifySubcripitionPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//h2[text()='Subscription']")
	WebElement Text;
	
	@FindBy(xpath="//input[@id=\"susbscribe_email\"]")
	WebElement Email;
	
	@FindBy(xpath="//button[@id=\"subscribe\"]")
	WebElement EmailButton;
	
	@FindBy(xpath="//div[@id=\"success-subscribe\"]")
	WebElement VerifyMessage;
	
	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void VerifySubcription() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		String Subscription=Text.getText();
		
		Assert.assertEquals(Subscription, "SUBSCRIPTION");
		}
	
	public void EnterEmail(String Name) {
		
		Email.sendKeys(Name);
		EmailButton.click();
		String Text=VerifyMessage.getText();
		Assert.assertEquals(Text, "You have been successfully subscribed!");
		
	}
}
