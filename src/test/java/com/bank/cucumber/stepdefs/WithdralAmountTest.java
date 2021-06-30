package com.bank.cucumber.stepdefs;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WithdralAmountTest {
    @When("^I click on withdral button$")
    public void iClickOnWithdralButton() throws InterruptedException {
        Thread.sleep(500);
        new AccountPage().clickOnWithdrawalButton();

    }

    @And("^I should enter amount to withdraw \"([^\"]*)\"$")
    public void iShouldEnterAmountToWithdraw(String amount) throws InterruptedException {
        Thread.sleep(500);
        new AccountPage().enterAmountToWithdrawal(amount);
    }

    @And("^I click on withdral Link$")
    public void iClickOnWithdralLink() {

        new AccountPage().clickOnWithdrawLink();
    }

    @Then("^I should see the meessage that transaction is successful$")
    public void iShouldSeeTheMeessageThatTransactionIsSuccessful() throws InterruptedException {
        Thread.sleep(500);
        String expectedMessage2 = "Transaction successful";
        String actualMessage2 = new AccountPage().getTextTransaction();
        Assert.assertEquals(actualMessage2, expectedMessage2);


    }
}
