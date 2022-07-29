package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//How you map your scenario step with your step definition method?
 // Ans: From the test runner we use cucumber option.Inside the cucumber option we have feature attribute.
 // This feature attribute providing the path of the feature file and glue giving the package name, what is the package we setup in here, that is the reason for feature file and step definition is connected,
// because inside this step definition package we have step class.

     features = "src/test/java/features",//path from content root
     glue = {"stepdefinations","configuration.hooks"}//path from repository root then we use just dot
//     tags = ,
//     dryRun = true,
//     monochrome = true






)
public class TestRunner {
}
