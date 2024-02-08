package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {

		this.driver = driver;
	}

	By CheckOut = By.cssSelector("img[alt='Cart']");
	By ProccedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By PromoButton = By.cssSelector(".promoBtn");
	By PlaceOrder = By.cssSelector("//button[contains(text(),'Place Order')]");
	By ProductName = By.cssSelector("h4[class='product-name']");

	public void CheckoutItems() {

		driver.findElement(CheckOut).click();
		driver.findElement(ProccedToCheckout).click();
	}

	public boolean VerifyPromoButton() {

		return driver.findElement(PromoButton).isDisplayed();
	}

	public boolean VerifyPlaceOrder() {
		
		return driver.findElement(PlaceOrder).isDisplayed();
	}
	
	public String ProductName() {
		
		return driver.findElement(ProductName).getText();
	}
}
