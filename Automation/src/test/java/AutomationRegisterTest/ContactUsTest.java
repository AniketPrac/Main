package AutomationRegisterTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AutomationRegisterPage.ContactUsPage;
import Component.BaseClass;

public class ContactUsTest extends BaseClass {
	
	
	@Test
	
	public void ContactUsForm() {
		
		ContactUsPage objContactUsPage=new ContactUsPage(driver);
		objContactUsPage.HomePage();
		objContactUsPage.ClickOnContctUs();
		objContactUsPage.VerifyGetinTouchText();
		objContactUsPage.EnterName("qaengineer");
		objContactUsPage.EnterEmail("qaengineer17@gmail.com");
		objContactUsPage.EnterSubject("Abc");
		objContactUsPage.EnterMassage("asdfghjkjhgfdsa");
		objContactUsPage.ClickOnButton();
	}

}
