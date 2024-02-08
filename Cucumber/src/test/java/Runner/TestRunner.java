package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="StepDefination", monochrome=true, plugin= {"pretty","html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
