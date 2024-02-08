package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.VerifyProductQuantityPage;
import Component.BaseClass;

public class VerifyProductQantityTest extends BaseClass{

	
	@Test
	
	public void VerifyProductQantity() {
		
		VerifyProductQuantityPage objVerifyProductQuantityPage=new VerifyProductQuantityPage(driver);
		objVerifyProductQuantityPage.HomePage();
		objVerifyProductQuantityPage.ViewProducts();
		objVerifyProductQuantityPage.VerifyQuantitys("4");
		objVerifyProductQuantityPage.ClickOnAddButton();
		objVerifyProductQuantityPage.VerifyQuantity();
	}
}
