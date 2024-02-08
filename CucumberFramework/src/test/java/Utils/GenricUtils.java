package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenricUtils {
	
	
	public WebDriver driver;
	public  GenricUtils(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public void SwitchtoWindow() {
		
		Set<String> windows =driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String ParentWindow = it.next();
		String ChileWindow = it.next();
		driver.switchTo().window(ChileWindow);
	}
}
