package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/java/features/AlertWorkType.feature"},
glue = {"stepdefination"},
dryRun = false,
monochrome = true,
plugin = {"pretty"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}


//make sure we do dryrun =false for execution after writing logic in methods in step defination class
//dry run=true will give us methods for steps in feature file when we run runner class file 