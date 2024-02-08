package TestNG;

import org.testng.annotations.Test;

public class Day1 {

	
	@Test
	public void Demo() {
		// TODO Auto-generated method stub

		System.out.println("Test");
	}
	
	@Test(groups= {"Smoke"})
	public void SecondDemo() {
		
		System.out.println("By");
	}
}
