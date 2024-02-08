package AutomationRegisterPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyProductPage extends SignUpPage {
	
	public VerifyProductPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//h2[normalize-space()='All Products']")
	WebElement NavigatetoProdct;
	
	@FindBy(xpath="(//a[text()='View Product'])[1]")
	WebElement ViewProduct;
	
	@FindBy(xpath="//h2[text()='Blue Top']")
	WebElement ProductName;
	
	@FindBy(xpath="//div[@class=\"product-information\"]//p")
	List <WebElement> details;
	
	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void ClickOnProductButton() {
		
		ClickOnProduct.click();
	}
	
	public void verifyProductPage() {
		
		String product=NavigatetoProdct.getText();
		
		Assert.assertEquals(product, "ALL PRODUCTS");
		
	}
	
	public void clickOnViewProduct() {
		
		ViewProduct.click();
	}
	
	public void VerifyProductName() {
		
		String VerifyProductName=ProductName.getText();
		
		Assert.assertEquals(VerifyProductName, "Blue Top");
	}
	
	public void productDetails() {
		
		ArrayList<Object>List=new ArrayList<Object>();
		List.add("Category: Women > Tops");
		List.add("Availability: In Stock");
		List.add("Condition: New");
		List.add("Brand: Polo");
		
		for(int i=0;i<details.size();i++) {
			
			System.out.println(details.get(i).getText());
			
			Assert.assertEquals(details.get(i).getText(), List.get(i));
		}
		
	}
}