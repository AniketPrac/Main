package AutomationRegisterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AutomationRegisterPage.SignUpPage;
import AutomationRegisterPage.TestCasePage2;
import Component.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestCaseTest2 extends BaseClass    {
  

	@Test()
	
	public void EnterLoginDetails() {
		
		TestCasePage2 objTestCasePage2=new TestCasePage2(driver);
		
		objTestCasePage2.clickSigUpbutton();
		objTestCasePage2.VerifyAccount();
		
	
		//("Login to your account", VerifyLogin);
		
		objTestCasePage2.EnterEmail("qaengineer17@gmail.com");
		objTestCasePage2.EnterEmailPass("Aniket*123");
		objTestCasePage2.EnterLoginButton();
		objTestCasePage2.VerifyLogUser();
	}
}
