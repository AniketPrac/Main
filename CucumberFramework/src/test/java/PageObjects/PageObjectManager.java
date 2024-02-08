package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	public CheckoutPage checkoutPage;
	
	
	
	public PageObjectManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public LandingPage getlandingPage() {
		
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage OfferPage() {
		
		offersPage=new OffersPage(driver);
		return offersPage;
	}
	
	public PageObjects.CheckoutPage CheckoutPage() {
		
		checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
	}

}
