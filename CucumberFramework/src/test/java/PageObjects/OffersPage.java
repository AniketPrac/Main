package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	
	By SearchFields=By.xpath("//input[@id=\"search-field\"]");
	
	By  GrabText=By.xpath("//td[normalize-space()='Tomato']");
	
	
	
	public void SearchField(String name) {
		
		driver.findElement(SearchFields).sendKeys(name);
	}
	
	public String Text() {
		
		return driver.findElement(GrabText).getText();
	}
}
