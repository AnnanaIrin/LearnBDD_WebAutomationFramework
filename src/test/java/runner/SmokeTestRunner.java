package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

//How you map your scenario step with your step definition method?
 // Ans: From the test runner we use cucumber option.Inside the cucumber option we have feature attribute.
 // This feature attribute providing the path of the feature file and glue giving the package name, what is the package we setup in here, that is the reason for feature file and step definition is connected,
// because inside this step definition package we have step class.

     features = "src/test/java/features",//path from content root
     glue = {"stepdefinations","configuration.hooks"}, //path from repository root then we use just dot
     monochrome = true,
     publish = true,
     dryRun = false,
     //Cucumber generate some report, We are using pretty plugin. Plugin name is pretty plugin.Inside plugin all are property.
     plugin = {
                "pretty",
                "html:target/cucumber-reports/index.html",
                "json:target/cucumber-reports/cucumber-report.json",
                "junit:target/cucumber-reports/cucumber-results.xml",
                "pretty:target/cucumber-reports/cucumber-pretty.txt",
                "rerun:target/cucumber-reports/rerun.txt"
     },
     tags = "@SmokeTest and not @pending" //tags is advance feature of BDD cucumber. Which will help us to run your test case base on your tag, not pending means not execute







)
//AbstractTestNGCucumberTests class come in from i.o.cucumber
public class SmokeTestRunner extends AbstractTestNGCucumberTests {



}
