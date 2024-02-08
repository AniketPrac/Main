package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Aniket\\Desktop\\chrome driver\\new\\chromedriver_win32 (7)//chromedriver.exe");
        
		//launch browser
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	     //navigate to URL 	
		 driver.get("https://automationexercise.com/");
	     //verify log in page
		 
		 String title= driver.getTitle();
		 
		 System.out.println(title);
		 
		 if(title.equalsIgnoreCase("automationexercise")) {
			 
			 System.out.println("Title is correct");
		 }else {
			 
			 System.out.println("Title is incorrect");
		 }
		 
		 //Click on 'Signup / Login' button
		 
		 driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		// Verify 'New User Signup!' is visible
		 
		 boolean Signuptext=driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed();
		 
		 if(Signuptext) {
			 
			 System.out.println("New User Signup visible succsesfully");
		 }else {
			 
			 System.out.println("New User Signup  not visible succsesfully");
		 }
		 
		//Enter name and email address
			
		 driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("qaengineer");
		 
		 driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("qaengineer16@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Signup']")).click();
		 
		 boolean ACINFO=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
	
		 if(ACINFO) {
			 
		   System.out.println("Enter Account Information visible succsesfully");
		 }else {
			 
			 System.out.println("Enter Account Information not visible ");
		 }
		 // Fill details: Title, Name, Email, Password, Date of birth
		 
		 driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		 
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Aniket*123");	
		 
		 WebElement Days=driver.findElement(By.xpath("//select[@id=\"days\"]"));
		 
		 Select days=new Select(Days);
		 days.selectByValue("19");
		 
		 WebElement months=driver.findElement(By.xpath("//select[@id=\"months\"]"));
		 
		 Select month=new Select(months);
		 month.selectByValue("10");
		 
		 WebElement year=driver.findElement(By.xpath("//select[@id=\"years\"]"));
		 
		 Select years=new Select(year);
		 years.selectByValue("1995");
		 
		 driver.findElement(By.xpath("//label[normalize-space()='Sign up for our newsletter!']")).click();
	     driver.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).click();
	     
	     driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("aniket");
	     driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("dapurkar");
	     driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("Wadegaon");
	     
	     WebElement country=driver.findElement(By.xpath("//Select[@id=\"country\"]"));
	     
	     Select count=new Select(country);
	     count.selectByValue("India");
	     
	     driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Maharshtra");
	     
	     driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Warud");
	     
	     driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("444906");
	     
	     driver.findElement(By.xpath("//input[@id=\"mobile_number\"]")).sendKeys("9665916339");
	     
	     System.out.println("Info succsesfully entered");
	}
	
	 
	
}
