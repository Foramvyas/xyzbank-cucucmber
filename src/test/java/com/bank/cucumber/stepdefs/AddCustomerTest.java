package com.bank.cucumber.stepdefs;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class AddCustomerTest {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on bankManager login Link$")
    public void iClickOnBankManagerLoginLink() {
        new HomePage().clickOnBakManagerLoginLink();
    }

    @And("^I click on add to customer tab$")
    public void iClickOnAddToCustomerTab() {
        new BankManagerLoginPage().clickOnAddToCustomerTab();
    }


    @And("^I enter First Name<\"([^\"]*)\">$")
    public void iEnterFirstName(String firstName) {
        new AddCustomerPage().enterFirstName(firstName);

    }

    @And("^I enter Last Name<\"([^\"]*)\">$")
    public void iEnterLastName(String lastName) {

        new AddCustomerPage().enterLastName(lastName);
    }

    @And("^I enter postCode<\"([^\"]*)\">$")
    public void iEnterPostCode(String postCode) {
        new
                AddCustomerPage().enterPostCode(postCode);
    }

    @And("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddToCustomerButton();
    }

    @Then("^I should verify pop up message$")
    public void iShouldVerifyPopUpMessage() {

        String actualMessage =  new AddCustomerPage().verifyPopUpMessage();
        Assert.assertTrue(actualMessage.contains("Customer added successfully"));

    }

    @And("^I accept pop up$")
    public void iAcceptPopUp() {
        new AddCustomerPage().clickOnOkPopUpButton();


    }


}
