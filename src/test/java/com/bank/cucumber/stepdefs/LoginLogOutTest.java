package com.bank.cucumber.stepdefs;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginLogOutTest {
    @And("^I click on Home Button Link$")
    public void iClickOnHomeButtonLink() {
        new HomePage().clickOnHomeButtonLink();

    }

    @And("^I click on customer Login Link$")
    public void iClickOnCustomerLoginLink() {
        new HomePage().clickOnCustomerLoginLink();

    }

    @When("^I click on Login Link$")
    public void iClickOnLoginLink() {
        new CustomerLoginPage().clickOnLoginLink();

    }

    @Then("^I should see that Log out button is displayed$")
    public void iShouldSeeThatLogOutButtonIsDisplayed() {
        new CustomerLoginPage().verifyLogoutButtonDisplayed();

    }
    @And("^I should see verify the text Logout$")
    public void iShouldSeeVerifyTheTextLogout() {
        String expectedText = "Logout";
        String actualText =  new CustomerLoginPage().verifyLogOutText();
        Assert.assertEquals(actualText, expectedText);


    }
    @When("^I click on Log Out Button$")
    public void iClickOnLogOutButton() {
        new CustomerLoginPage().clickOnLogOutButton();

    }
    @Then("^I should see the your name text is displayed \"([^\"]*)\"$")
    public void iShouldSeeTheYourNameTextIsDisplayed(String text)  {
        new CustomerLoginPage().veriftTextYourNameDisplayed(text);

    }


    @And("^I should verify the test Your Name$")
    public void iShouldVerifyTheTestYourName() {
        String expectedMessage2 = "Your Name :";
        String actualMessage2 =  new CustomerLoginPage().verifyYourNameText();
        Assert.assertEquals(actualMessage2, expectedMessage2);



    }



}
