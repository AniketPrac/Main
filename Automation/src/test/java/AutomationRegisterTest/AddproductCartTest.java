package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.AddProductCartPage;
import Component.BaseClass;

public class AddproductCartTest extends BaseClass {
	
	@Test
	
	public void AddProducts() throws InterruptedException {
		
		AddProductCartPage objAddProductCartPage=new AddProductCartPage(driver);
		
	
		
		objAddProductCartPage.HomePage();
		objAddProductCartPage.ProductPage();
		Thread.sleep(1000);
		objAddProductCartPage.AddCart();
		Thread.sleep(1000);
		objAddProductCartPage.ListProduct();
	}

}
