package AutomationRegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage {
	
   public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	
	WebElement SignUpClick;
	
	@FindBy(xpath="//input[@data-qa=\"signup-name\"]")
	WebElement UserName;
	
	@FindBy(xpath="(//input[@data-qa=\"signup-email\"])")
	
	WebElement UserEmail;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement LogIn;
	
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement VNewUsersignup;
	
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement VenterInfo;
	
	public void GetTitle() {
		
		 String gettitle=driver.getTitle();
		 
		 System.out.println(gettitle);
		 Assert.assertEquals("Automation Exercise",gettitle );
		 SignUpClick.click();
		 
	
		
		 
	}
	
	public void enterUsername(String name) {
		
		UserName.sendKeys(name);
		
	}
	
	public void enterUserEmail(String Email) {
		
		UserEmail.sendKeys(Email);
	}
	
	public void enterLogin() {
		
		LogIn.submit();
	}
	
	public void NewUserPage() {
		
		String newusertext=VNewUsersignup.getText();
		Assert.assertEquals("New User Signup!", newusertext);
	}
	
	public void Verifyinfo() {
		
		String enterinfo=VenterInfo.getText();
		Assert.assertEquals("ENTER ACCOUNT INFORMATION", enterinfo);
	}
	
	public void goTo() {
		
		driver.get("https://automationexercise.com/");
	}

}
