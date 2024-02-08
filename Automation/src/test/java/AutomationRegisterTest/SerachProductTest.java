package AutomationRegisterTest;

import org.testng.annotations.Test;

import AutomationRegisterPage.SearchProductPage;
import Component.BaseClass;

public class SerachProductTest extends BaseClass {

	@Test
	
	public void SearchProduct() throws InterruptedException {
		
		SearchProductPage objSearchProductPage=new SearchProductPage(driver);
		objSearchProductPage.HomePage();
		objSearchProductPage.ClickOnProduct();
		objSearchProductPage.AllProductPage();
		objSearchProductPage.SerchProduct("jeans");
		objSearchProductPage.ClickOnSearchButton();
		Thread.sleep(2000);
		objSearchProductPage.SerchProductPage();
		objSearchProductPage.ProductInformation();
	}
}
