package com.example.bdd.steps;

import com.example.application.usecases.AvailableConversionsUseCase;
import com.example.bdd.BaseIntegrationTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ConverterSteps extends BaseIntegrationTest {
    HashMap<String, Object> dataHolder = new HashMap<>();
    Boolean lastCheck = false;

    @Autowired
    AvailableConversionsUseCase availableConversionsUseCase;

    @Given("^the list of providers$")
    public void the_list_of_providers() throws Throwable {
        List<String> availableConversions = availableConversionsUseCase.run();
        dataHolder.put("availableConversions", availableConversions);
    }

    @When("^I check \"([^\"]*)\" is there$")
    public void i_check_is_there(String name) throws Throwable {
        List<String> availableConversion = (List<String>) dataHolder.get("availableConversions");
        lastCheck = availableConversion.contains(name);
    }

    @Then("^It should be true$")
    public void it_should_be_true() throws Throwable {
        assertTrue(lastCheck);
        lastCheck = false;
    }

    @Given("^I want to convert from \"([^\"]*)\"$")
    public void i_want_to_convert_from(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I want to convert to \"([^\"]*)\"$")
    public void i_want_to_convert_to(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^input is \"([^\"]*)\"$")
    public void input_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^output is \"([^\"]*)\"$")
    public void output_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
