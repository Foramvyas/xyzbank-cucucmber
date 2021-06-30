package com.bank.cucumber.stepdefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OpenAccTest {
    @And("^I click on open account tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I select name of customer from drop down<\"([^\"]*)\">$")
    public void iSelectNameOfCustomerFromDropDown(String fullName) throws InterruptedException {
        Thread.sleep(500);
        new OpenAccountPage().selectNameFromDropDown(fullName);
    }

    @And("^I select currency<\"([^\"]*)\">$")
    public void iSelectCurrency(String currency) {
        new OpenAccountPage().selectCurrency(currency);
    }

    @When("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();

    }

    @Then("^I should verify the message$")
    public void iShouldVerifyTheMessage() {
        String actualMessage1 = new AddCustomerPage().verifyPopUpMessage();
        Assert.assertTrue(actualMessage1.contains("Account created successfully"));

    }


}
