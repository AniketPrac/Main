package Utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TextContextSetUp {
	
	public WebDriver driver;
	public String HomepageText;
	public String ChildWindowText;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenricUtils genricutils;
	
	public TextContextSetUp() {
		
		testbase=new TestBase();
		
		pageObjectManager=new PageObjectManager(testbase.WebdriverManager());
		genricutils=new GenricUtils(testbase.WebdriverManager());
	}

}
