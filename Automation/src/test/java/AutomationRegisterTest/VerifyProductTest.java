package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.VerifyProductPage;
import Component.BaseClass;

public class VerifyProductTest extends BaseClass {
	
	
	@Test
	public void ProductDetailPage() throws InterruptedException {
		
		VerifyProductPage objVerifyProductPage=new VerifyProductPage(driver);
		objVerifyProductPage.HomePage();
		objVerifyProductPage.ClickOnProductButton();
		objVerifyProductPage.verifyProductPage();
		Thread.sleep(2000);
		objVerifyProductPage.clickOnViewProduct();
		objVerifyProductPage.VerifyProductName();
		objVerifyProductPage.productDetails();
		
	}

}
