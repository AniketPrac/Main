package TestNG;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void WebcarLoan() {
		
		System.out.println("WebCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobilecarLoan() {
		
		System.out.println("MobileCarLoan");
	}
	
	@Test
	public void ApicarLoan() {
		
		System.out.println("ApiCarLoan");
	}
}
