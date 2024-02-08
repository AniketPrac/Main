package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.VerifySubcripitionPage;
import Component.BaseClass;

public class VerifySubcriptionTest extends BaseClass {
	
	@Test
	
	public void VerifySubcriptinHomePage() {
		
		VerifySubcripitionPage objVerifySubcripitionPage=new VerifySubcripitionPage(driver);
		objVerifySubcripitionPage.HomePage();
		objVerifySubcripitionPage.VerifySubcription();
		objVerifySubcripitionPage.EnterEmail("dapurkar@gmail.com");
	}

}
