package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"C:\\Users\\Rahul Kakade\\eclipse-workspace\\AutomationTechieBDD\\TestFeatures\\Outline.feature"},
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:html-output/report.html","json:json-outup/report.json","junit:junit-output/reports.xml"},
		monochrome = true,
		dryRun = false,
		publish= true,
		tags= "@smoke or @sanity or not regression"		// ~ is sign for NOT means dont run ~@tagname 
		)



public class TestRunner {

}
