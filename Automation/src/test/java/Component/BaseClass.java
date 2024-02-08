package Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AutomationRegisterPage.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	

	
	@SuppressWarnings("deprecation")
	public WebDriver intilizeDriver() throws IOException {
		
		//properties file
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Aniket\\eclipse-workspace\\Automation\\src\\main\\java\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
				
			if(browserName.equalsIgnoreCase("chrome"))	{
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  
		  
			}
			else if(browserName.equalsIgnoreCase("chrome")) {
				
				//Firefox
			}
			
			else if(browserName.equalsIgnoreCase("edge")) {
				
				//edge
				
				
			}
			
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			  
			driver.manage().window().maximize();
			
		
			
			return driver;
	}
	
	
	@BeforeMethod()
	public void LaunchApp() throws IOException {
			
		driver=intilizeDriver();
		
		SignUpPage objSignUpPage=new SignUpPage(driver);
		objSignUpPage.goTo();
	}
	
	
//	@AfterMethod()	
//   public void TearDown() {
//	
//		driver.close();		
		
	//}

}
