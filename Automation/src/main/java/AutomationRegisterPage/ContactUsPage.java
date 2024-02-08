package AutomationRegisterPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage extends SignUpPage {

	public ContactUsPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()=' Contact us']")
	WebElement ClickOnContactUs;

	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
	WebElement VGetInTouch;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement ContactName;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement ContactEmail;
	
	@FindBy(xpath="//input[@name=\"subject\"]")
	WebElement ContactSubject;
	
	@FindBy(xpath="//textarea[@name=\"message\"]")
	WebElement ContactMassage;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement ClickonButton;

	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void ClickOnContctUs() {
		
		ClickOnContactUs.click();
	}
	
	public void VerifyGetinTouchText() {
		
		String Text=VGetInTouch.getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "GET IN TOUCH");
	}
	

	public void EnterName(String Name) {
		
		ContactName.sendKeys(Name);
		
	}
	
	public void EnterEmail(String Email) {
		
		ContactEmail.sendKeys(Email);
	}
	
	public void EnterSubject(String Subject) {
		
		ContactSubject.sendKeys(Subject);
	}
	
	public void EnterMassage(String Massage) {
		
		ContactMassage.sendKeys(Massage);
	}
	
	public void ClickOnButton() {
		
		ClickonButton.click();
		
		Alert alert=driver.switchTo().alert();
		
		String AlertMassage=driver.switchTo().alert().getText();
		System.out.println(AlertMassage);
		alert.accept();
		
	}

}
