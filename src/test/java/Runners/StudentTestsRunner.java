package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty",
        "html:target/myReport.html",
        "json:target/student-report.json"},
        tags = "@Student"
)
public class StudentTestsRunner extends AbstractTestNGCucumberTests {
}
