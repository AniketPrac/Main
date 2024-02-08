
package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.LogOutUserPage;
import Component.BaseClass;

public class LogOutUsetTest extends BaseClass {

	@Test
	
	public void LogOutUser() throws InterruptedException {
		
		LogOutUserPage objLogOutUserPage=new LogOutUserPage(driver);
		objLogOutUserPage.clickSigUpbutton();
		objLogOutUserPage.VerifyAccount();
		objLogOutUserPage.EnterEmail("qaengineer17@gmail.com");
		objLogOutUserPage.EnterEmailPass("Aniket*123");
		objLogOutUserPage.EnterLoginButton();
		objLogOutUserPage.VerifyLogUser();
		Thread.sleep(1000);
		objLogOutUserPage.NavigateLogInPage();
		
	}
}
