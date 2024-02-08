package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.TestCasePage3;
import Component.BaseClass;

public class TestCaseTest3 extends BaseClass {

	
	@Test()
	
	public void WrongLoginDeatils()
	{
		TestCasePage3 objTestcase3=new TestCasePage3(driver);
		
		objTestcase3.clickSigUpbutton();
		objTestcase3.VerifyAccount();
		objTestcase3.EnterEmail("aniket@gmail.com");
		objTestcase3.EnterEmailPass("asdfggh");
		objTestcase3.EnterLoginButton();
		objTestcase3.verifyError();
	}
}
