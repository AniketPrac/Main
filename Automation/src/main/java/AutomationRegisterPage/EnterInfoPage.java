package AutomationRegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EnterInfoPage extends SignUpPage {

	public EnterInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement Title;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "days")
	WebElement Day;

	@FindBy(id = "months")
	WebElement Month;

	@FindBy(id = "years")
	WebElement Year;

	@FindBy(id = "newsletter")
	WebElement NewsLetter;
	@FindBy(xpath = "//label[normalize-space()='Receive special offers from our partners!']")
	WebElement Recive;

	@FindBy(id = "first_name")
	WebElement Fname;

	@FindBy(id = "last_name")
	WebElement Lname;

	@FindBy(id = "company")
	WebElement Cmpany;

	@FindBy(id = "address1")
	WebElement add1;

	@FindBy(id = "address2")
	WebElement add2;

	@FindBy(id = "country")
	WebElement County;

	@FindBy(id = "state")
	WebElement State;

	@FindBy(id = "city")
	WebElement Cites;

	@FindBy(id = "zipcode")
	WebElement ZipCode;

	@FindBy(id = "mobile_number")
	WebElement Mnumber;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement Sbutton;
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement VaccountCreated;

	public void gender() {

		Title.click();
	}

	public void Enterpass(String passwords) {

		Password.sendKeys(passwords);
	}

	public void SelectDays(String days) {

		Select select = new Select(Day);

		select.selectByValue(days);

	}

	public void SelectMonth(String month) {

		Select select = new Select(Month);

		select.selectByValue(month);

	}

	public void SelectYear(String years) {

		Select select = new Select(Year);

		select.selectByValue(years);

	}

	public void CheckNewsLetter() {

		NewsLetter.click();
	}

	public void RecivInfo() {

		Recive.click();
	}

	public void FisrtName(String name) {

		Fname.sendKeys(name);
	}

	public void LastName(String name2) {

		Lname.sendKeys(name2);
	}

	public void CompanyName(String Cname) {

		Cmpany.sendKeys(Cname);
	}

	public void Address1(String adds1) {

		add1.sendKeys(adds1);
	}

	public void Address2(String adds2) {

		add2.sendKeys(adds2);
	}

	public void Country(String Cnt) {

		Select select = new Select(County);
		select.selectByValue(Cnt);
	}

	public void State(String States) {

		State.sendKeys(States);
	}

	public void Citis(String city) {

		Cites.sendKeys(city);
	}

	public void ZipCodes(String zip) {

		ZipCode.sendKeys(zip);
	}

	public void MobilNumber(String number) {

		Mnumber.sendKeys(number);
	}
	
	public void CreateAccount() throws InterruptedException {
		
		Thread.sleep(1000);
		Sbutton.click();;
	}
	
	public void AccountCreated() {
		
		String verifyAccount=VaccountCreated.getText();
	
		
	}
}

