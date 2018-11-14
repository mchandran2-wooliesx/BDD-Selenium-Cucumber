package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/shify/Documents/Workspace2/BDDFrameworkFreeCRM/src/main/java/Features/dealsmap.feature", //path of feature file
		glue = {"stepDefinition"}, //path of the stepDefinition files
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // generate different types of report: html, json, junit xml output etc.
		monochrome = true, // display the console output in a readable format
		strict = true, //check if any step is not defined in  step definition file 
		dryRun = false // checks if the mapping is proper between feature file and step definition
		
		)

public class TestRunner 
{
	

}
