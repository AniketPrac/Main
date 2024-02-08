package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utils.TextContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TextContextSetUp textcontextsetup;
	public Hooks(TextContextSetUp textcontextsetup) {
		
		this.textcontextsetup=textcontextsetup;
	}
	
	@After
	public void afterScinario() {
		
		textcontextsetup.testbase.WebdriverManager().quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
	
		WebDriver driver=textcontextsetup.testbase.WebdriverManager();
		
		File SourcPath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		byte[] filecontent=FileUtils.readFileToByteArray(SourcPath);
		
		scenario.attach(filecontent, "image/png", "image");
	}
}
