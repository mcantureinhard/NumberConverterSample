package com.example.bdd.steps;

import com.example.application.usecases.AvailableConversionsUseCase;
import com.example.application.usecases.NumberConverterUseCase;
import com.example.bdd.BaseIntegrationTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.AssertTrue;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ConverterSteps extends BaseIntegrationTest {
    HashMap<String, Object> dataHolder = new HashMap<>();
    Boolean lastCheck = false;
    String lastResult = "";

    @Autowired
    AvailableConversionsUseCase availableConversionsUseCase;

    @Autowired
    NumberConverterUseCase numberConverterUseCase;

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
    public void i_want_to_convert_from(String from) throws Throwable {
        dataHolder.put("convertFrom", from);
    }

    @Given("^I want to convert to \"([^\"]*)\"$")
    public void i_want_to_convert_to(String to) throws Throwable {
        dataHolder.put("converterTo", to);
    }

    @When("^input is \"([^\"]*)\"$")
    public void input_is(String input) throws Throwable {
        lastResult = numberConverterUseCase.run(input, (String)dataHolder.get("convertFrom"), (String)dataHolder.get("convertTo"));
    }

    @Then("^output is \"([^\"]*)\"$")
    public void output_is(String expected) throws Throwable {
        Assert.assertEquals(expected, lastResult);
    }
}
