package Component;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;

public class Listener implements ITestListener {
	
	ExtentReports extent=Extentreporterng.getreportobject();
	public void onTestStart(ITestResult result) {
		
		extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccses(ITestResult result) {
		
		
	}

}
