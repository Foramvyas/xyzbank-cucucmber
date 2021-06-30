package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DepositAmountTest {
    @When("^I click on deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I should enter amount to deposit \"([^\"]*)\"$")
    public void iShouldEnterAmountToDeposit(String amount)  {
       new AccountPage().enterAmountToDeposit(amount);
    }

    @When("^I click on deposit tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickDepositTab();
    }

    @Then("^I should verify the text message that money deposited successfully$")
    public void iShouldVerifyTheTextMessageThatMoneyDepositedSuccessfully() {
        String expectedMessage3 = "Deposit Successful";
        String actualMessage3 =  new AccountPage().getTextDepositSuccessfulMessage();
        Assert.assertEquals(actualMessage3, expectedMessage3);

    }
}
