package AutomationRegisterTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AutomationRegisterPage.EnterInfoPage;

public class EnterInfoTest {
  
  WebDriver driver;
	
	@Test(priority=5)
	
	public void GenderInfo() {
		
		EnterInfoPage objEnterInfoPage=new EnterInfoPage(driver);
		objEnterInfoPage.gender();
		objEnterInfoPage.Enterpass("Aniket*123");
	}
	
	@Test(priority=6)
	public void DateOfBirth() {
		
		EnterInfoPage objEnterInfoPage=new EnterInfoPage(driver);
		objEnterInfoPage.SelectDays("19");
		objEnterInfoPage.SelectMonth("10");
		objEnterInfoPage.SelectYear("1995");
	}
	
	@Test(priority=7)
	
	public void CheckMark() {
		
		EnterInfoPage objEnterInfoPage=new EnterInfoPage(driver);
		objEnterInfoPage.CheckNewsLetter();
		objEnterInfoPage.RecivInfo();
	}
	
	@Test(priority=8)
	
	public void AddressInformation() {
		
		EnterInfoPage objEnterInfoPage=new EnterInfoPage(driver);
		objEnterInfoPage.FisrtName("Aniket");
		objEnterInfoPage.LastName("Dapurkar");
		objEnterInfoPage.CompanyName("Intellect");
		objEnterInfoPage.Address1("Intellect design mumbai,maharashtra");
		objEnterInfoPage.Address2("Wadegaon");
		objEnterInfoPage.Country("India");
		objEnterInfoPage.State("Maharashtra");
		objEnterInfoPage.Citis("Warud");
		objEnterInfoPage.ZipCodes("444906");
		objEnterInfoPage.MobilNumber("9665916339");	
	}
	
	@Test(priority=9)
	
	public void EnterCreateAccount() throws InterruptedException {
		
		EnterInfoPage objEnterInfoPage=new EnterInfoPage(driver);
		objEnterInfoPage.CreateAccount();
		objEnterInfoPage.AccountCreated();
		
	}
}
