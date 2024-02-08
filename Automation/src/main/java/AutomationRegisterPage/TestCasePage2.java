package AutomationRegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCasePage2 extends SignUpPage {

	WebDriver driver;
	public TestCasePage2(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
			
	}
	
    @FindBy(xpath="//a[normalize-space()='Signup / Login']")
	
	WebElement SignUpClick;
    
    @FindBy(xpath="//h2[normalize-space()='Login to your account']")
    WebElement VerifyLoginAccount;
	
	@FindBy(xpath="//input[@data-qa=\"login-email\"]")
	WebElement EmailAdd;
	
	@FindBy(xpath="//input[@data-qa=\"login-password\"]")
	WebElement EmailPass;
	
	@FindBy(xpath="//button[@data-qa=\"login-button\"]")
	WebElement LoginButton;
	//WebElement VerifyLogin= driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
	
	
	
	@FindBy(xpath="//b[normalize-space()='qaengineer']")
	
	WebElement VerfifyUser;
	
	public void clickSigUpbutton() {
		
		SignUpClick.click();
	}
	
	public void VerifyAccount() {
		
		String Account=VerifyLoginAccount.getText();
		
		Assert.assertEquals(Account, "Login to your account");
	}
	public void EnterEmail(String Email) {
		
		EmailAdd.sendKeys(Email);
	}
	
	public void EnterEmailPass(String Pass) {
		
		EmailPass.sendKeys(Pass);
	}
	
	public void EnterLoginButton() {
		
		LoginButton.click();
	}
	
	
	public void VerifyLogUser() {
		
		String User=VerfifyUser.getText();
		
		Assert.assertEquals(User, "qaengineer");
		
	}
	
	
	
}
