package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.RegisterUserExistingMailPage;
import Component.BaseClass;

public class RegisterUserExistingTest extends BaseClass {
	
	@Test
	
	public void RegistExistingUser() {
		
		RegisterUserExistingMailPage objRegisterUserExistingMailPage=new RegisterUserExistingMailPage(driver);
		objRegisterUserExistingMailPage.ClickSignupText();
		objRegisterUserExistingMailPage.SignUpName("qaengineer");
		objRegisterUserExistingMailPage.SignUpPassword("qaengineer17@gmail.com");
		objRegisterUserExistingMailPage.ClickButton();
		objRegisterUserExistingMailPage.VerifyErrorText();
	}

}
