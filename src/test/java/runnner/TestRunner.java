package runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".",
				monochrome=true,
				glue="StepDefinition",
				tags="@smokeTest",
				dryRun=false,
				plugin= {"pretty",
				"html:target/cucumber-reports",
				"rerun:rerun/failed_scenario.txt"}
				
				)



public class TestRunner {

}
