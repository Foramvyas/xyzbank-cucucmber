package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;

    public void clickOnAddToCustomerTab(){

        log.info("Clicking on Add to Customer tab " +addCustomerTab);
        clickOnElement(addCustomerTab);

    }
    public void clickOnOpenAccountTab(){

        log.info("Clicking on open account tab " +openAccountTab);
        clickOnElement(openAccountTab);

    }


}
