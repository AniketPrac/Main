package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.SignUpPage;
import Component.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SignUpTest extends BaseClass {
 
 
  @Test()
  public void NavigateHomePage() throws IOException {
	  
	  //LaunchApp();
	  SignUpPage objSignUpPage=new SignUpPage(driver);
	  
	 objSignUpPage.GetTitle();
	  objSignUpPage.enterUsername("qaengineer");
	  objSignUpPage.enterUserEmail("qaengineer17@gmail.com");
	  objSignUpPage.enterLogin();
	  
	  objSignUpPage.NewUserPage();
  
	  objSignUpPage.Verifyinfo();
  }
}
