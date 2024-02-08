package StepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TextContextSetUp;
import io.cucumber.java.en.Then;

public class OfferPage {

	public String ChildWindowText;
	TextContextSetUp textcontextsetup;
	PageObjectManager pageObjectManager;

	public OfferPage(TextContextSetUp textcontextsetup) {

		this.textcontextsetup = textcontextsetup;
	}

	@Then("^User is search for same name (.+) in offers page to check if product exist$")
	public void user_is_search_for_same_name_in_offers_page_to_check_if_product_exist(String name)
			throws InterruptedException {

		// pageObjectManager=new PageObjectManager(textcontextsetup.driver);

		OffersPage OffersPage = textcontextsetup.pageObjectManager.OfferPage();
		// OffersPage OffersPage = new OffersPage(textcontextsetup.driver);
		LandingPage landingPage = textcontextsetup.pageObjectManager.getlandingPage();
		// LandingPage LandingPage=new LandingPage(textcontextsetup.driver);
		landingPage.TopDeals();
		// textcontextsetup.driver.findElement(By.xpath("//a[normalize-space()='Top
		// Deals']")).click();

		// OffersPage.SearchField(name);
		Thread.sleep(2000);

		// textcontextsetup.driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(name);

		textcontextsetup.genricutils.SwitchtoWindow();

		OffersPage.SearchField(name);

		String ChildWindowText = OffersPage.Text();

	}

	@Then("Validate the both the products")
	public void Validate_the_both_the_products() {

		Assert.assertEquals(textcontextsetup.HomepageText, ChildWindowText);

	}
}
