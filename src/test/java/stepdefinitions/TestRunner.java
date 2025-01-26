package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
      features="src/test/resources/Features",
      glue = "stepdefinitions",                 // Package for step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // HTML Report
    monochrome = true                         // Readable console output
    	
		)








public class TestRunner {

}
