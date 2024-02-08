package AutomationRegisterPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterUserExistingMailPage extends SignUpPage {

	WebDriver driver;

	public RegisterUserExistingMailPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")

	WebElement SignUpClick;
	
	@FindBy(css="input[placeholder='Name']")
	WebElement SignUpName;

	@FindBy(css="input[data-qa='signup-email']")
	WebElement SignupEmail;
	@FindBy(xpath="//button[@data-qa=\"signup-button\"]")
	WebElement SignUp;
	@FindBy(xpath="//p[text()='Email Address already exist!']")
	WebElement ErrorText;
	
	public void ClickSignupText() {
		
		SignUpClick.click();
	}
	public void SignUpName(String name) {
		
		SignUpName.sendKeys(name);
	}
	
	public void SignUpPassword(String Email) {
		SignupEmail.sendKeys( Email);
		
	}
	
	public void ClickButton() {
		
		SignUp.click();
	}
	
	public void VerifyErrorText() {
		
		
		String text=ErrorText.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Email Address already exist!");
	}

}
