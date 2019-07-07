package com.example.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"}
        , features = "src/bdd/resources/features"
        , tags = {}
)
public class DemoFeatureRunner {
}