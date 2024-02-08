package AutomationRegisterPage;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import scala.collection.mutable.HashMap;



public class AddProductCartPage extends SignUpPage {

	WebDriver driver;

	public AddProductCartPage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href=\"/products\"]")
	WebElement ClickOnProduct;
	
	@FindBy(xpath="//a[@data-product-id=\"1\"]")
	WebElement ClickOnAddCart;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement CountiniueShopping;
	
	@FindBy(xpath="(//a[@data-product-id=\"2\"])[1]")
	WebElement  ClickonSecondAddCart;
	
	@FindBy(xpath="//u[text()='View Cart']")
	WebElement ClickonViewCart;
	
	@FindBy(xpath="//table[@id='cart_info_table']")
	List<WebElement> listProduct;
	
	@FindBy(id="product-1")
	List<WebElement> product1;
	
	@FindBy(id="product-2")
	List<WebElement> product2;
	
	
	public void HomePage() {

		String title = driver.getTitle();

		System.out.println(title);
		
		Assert.assertEquals(title, "Automation Exercise");
		
	}
	
	public void ProductPage() {
		
		ClickOnProduct.click();
		
	}
	
	public void AddCart() {
		
		ClickOnAddCart.click();
		CountiniueShopping.click();
		ClickonSecondAddCart.click();
		ClickonViewCart.click();
		
	}
	
	public void ListProduct() {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		map.put(1, "Blue Top");
		map.put(1,"Women > Tops");
		map.put(1, "Rs. 500");
		map.put(1, "1");
		map.put(1, "Rs. 500");
		map.put(2, "Men Tshirt");
		map.put(2,"Men > Tshirts");
		map.put(2, "Rs. 400");
		map.put(2, "1");
		map.put(2, "Rs. 400");
		
		for(int i=0;i<product1.size();i++) {

		Assert.assertTrue(product2.get(i).getText().equalsIgnoreCase("Men Tshirt"));
			
			
		}
	}
}
