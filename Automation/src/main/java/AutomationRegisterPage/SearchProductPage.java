package AutomationRegisterPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProductPage extends SignUpPage {

	WebDriver driver;

	public SearchProductPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//h2[normalize-space()='All Products']")
	WebElement NavigatetoProdct;
	
	@FindBy(xpath="//input[@id=\"search_product\"]")
	WebElement SearchProduct;
	
	@FindBy(xpath="//button[@id=\"submit_search\"]")
	WebElement ClcikOnSearch;
	
	@FindBy(xpath="//h2[text()='Searched Products']")
	WebElement SerchProductVisible;
	
	@FindBy(xpath="//div[contains(@class,'productinfo')]//p")
	List<WebElement> Items;
	
	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void ClickOnProduct() {
		
		ClickOnProduct.click();
	}
	
	public void AllProductPage() {
		
		String Product=NavigatetoProdct.getText();
		
		Assert.assertEquals(Product, "ALL PRODUCTS");
	}
	
	public void SerchProduct(String Name) {
		
		SearchProduct.sendKeys(Name);
	}
	
	public void ClickOnSearchButton() {
		
		ClcikOnSearch.click();
	}
	
	public void SerchProductPage() {
		
		String SearchProduct=SerchProductVisible.getText();
		
		Assert.assertEquals(SearchProduct, "SEARCHED PRODUCTS");
	}
	
	public void ProductInformation() {
		
		for(int i=0;i<Items.size();i++) {
			
			System.out.println(Items.get(i).getText());
			Assert.assertTrue(Items.get(i).getText().contains("jeans"));
			
		}
	}
}
