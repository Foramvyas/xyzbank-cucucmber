package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//7.AccountPage - store Transaction, deposit and withdraw.

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositLink;

    @FindBy(xpath = "//div[@class='form-group']/input")
    WebElement entreAmount;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositButton;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement getTextDepositSuccessful;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToBeWithdrawn;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdrawButton;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement getTransactionText;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawlLink;


    public void clickOnDepositButton() {

        clickOnElement(depositLink);
        log.info("Clicking On Deposit Button :" +depositLink.toString());
    }

    public void enterAmountToDeposit(String depositAmount) {

        sendTextToElement(entreAmount,depositAmount);
        log.info("Entering Amount To Deposit : " +depositAmount +"in deposit field : " + amountToBeWithdrawn.toString());


    }

    public void clickDepositTab() {

        clickOnElement(depositButton);
        log.info("Clicking on Deposit Button :" +depositButton.toString());

    }

    public String getTextDepositSuccessfulMessage() {

        log.info("Getting Deposit Successful Message :" + getTextDepositSuccessful.toString());
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithdrawalButton() {

        clickOnElement(withdrawButton);
        log.info("Clicking On Withdrawal Tab :" + withdrawButton.toString());
    }

    public void enterAmountToWithdrawal( String withdrawlAmount) {

        sendTextToElement(amountToBeWithdrawn,withdrawlAmount);
        log.info("Entering Amount To Withdrawal :" +withdrawlAmount + "in withdrawal field :" + amountToBeWithdrawn.toString());

    }

    public void clickOnWithdrawLink() {

        clickOnElement(withdrawlLink);
        log.info("Clicking On Withdraw feature :" + withdrawlLink.toString());
    }

    public String getTextTransaction() {

        log.info("Getting transaction text :" +getTransactionText.toString());
        return getTextFromElement(getTransactionText);
    }



}
