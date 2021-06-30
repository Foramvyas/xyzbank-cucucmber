package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

   // @FindBy(xpath = "//button[contains(text(),'Home')]")
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeButton;

    public void clickOnCustomerLoginLink(){

        clickOnElement(customerLogin);
        log.info("Clicking on Customer Login link" + customerLogin.toString());
    }

    public void clickOnBakManagerLoginLink(){

        clickOnElement(bankManagerLogin);
        log.info("Clicking on bank manager Login link" + bankManagerLogin.toString());
    }

    public void clickOnHomeButtonLink(){

        clickOnElement(homeButton);
        log.info("Clicking on home button link" + homeButton.toString());
    }


    }






