$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/banking.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "As a bank manager I want to open the account for customer, add customer and allow him to withdraw and deposit money successfully",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9487606300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "I am on home page",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 97,
  "name": "Verify user should withdraw money from account successfully",
  "description": "",
  "id": "bank-test;verify-user-should-withdraw-money-from-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 95,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 99,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 100,
  "name": "I click on bankManager login Link",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I click on add to customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I enter First Name\u003c\"Virat\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "I enter Last Name\u003c\"Mehta\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I enter postCode\u003c\"NW9 9HN\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I click on add customer button",
  "keyword": "When "
});
formatter.step({
  "line": 106,
  "name": "I should verify pop up message",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "I accept pop up",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "I click on open account tab",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "I select name of customer from drop down\u003c\"Virat Mehta\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "I select currency\u003c\"Pound\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "I click on process button",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "I should verify the message",
  "keyword": "Then "
});
formatter.step({
  "line": 114,
  "name": "I accept pop up",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "I click on Home Button Link",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "I click on customer Login Link",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "I select name of customer from drop down\u003c\"Virat Mehta\"\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I click on Login Link",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I click on deposit button",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "I should enter amount to deposit \"100\"",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "I click on deposit tab",
  "keyword": "When "
});
formatter.step({
  "line": 123,
  "name": "I should verify the text message that money deposited successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 125,
  "name": "I click on withdral button",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "I should enter amount to withdraw \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "I click on withdral Link",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "I should see the meessage that transaction is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerTest.iAmOnHomePage()"
});
formatter.result({
  "duration": 405664100,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iClickOnBankManagerLoginLink()"
});
formatter.result({
  "duration": 221086000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iClickOnAddToCustomerTab()"
});
formatter.result({
  "duration": 371822700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virat",
      "offset": 20
    }
  ],
  "location": "AddCustomerTest.iEnterFirstName(String)"
});
formatter.result({
  "duration": 630387200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mehta",
      "offset": 19
    }
  ],
  "location": "AddCustomerTest.iEnterLastName(String)"
});
formatter.result({
  "duration": 168455100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NW9 9HN",
      "offset": 18
    }
  ],
  "location": "AddCustomerTest.iEnterPostCode(String)"
});
formatter.result({
  "duration": 202054300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 126863400,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iShouldVerifyPopUpMessage()"
});
formatter.result({
  "duration": 22887000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iAcceptPopUp()"
});
formatter.result({
  "duration": 47404100,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccTest.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 166414300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virat Mehta",
      "offset": 42
    }
  ],
  "location": "OpenAccTest.iSelectNameOfCustomerFromDropDown(String)"
});
formatter.result({
  "duration": 765203500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 19
    }
  ],
  "location": "OpenAccTest.iSelectCurrency(String)"
});
formatter.result({
  "duration": 244600500,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccTest.iClickOnProcessButton()"
});
formatter.result({
  "duration": 138714200,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccTest.iShouldVerifyTheMessage()"
});
formatter.result({
  "duration": 9536000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerTest.iAcceptPopUp()"
});
formatter.result({
  "duration": 36821800,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogOutTest.iClickOnHomeButtonLink()"
});
formatter.result({
  "duration": 149889600,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogOutTest.iClickOnCustomerLoginLink()"
});
formatter.result({
  "duration": 136745500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virat Mehta",
      "offset": 42
    }
  ],
  "location": "OpenAccTest.iSelectNameOfCustomerFromDropDown(String)"
});
formatter.result({
  "duration": 709667400,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogOutTest.iClickOnLoginLink()"
});
formatter.result({
  "duration": 144333700,
  "status": "passed"
});
formatter.match({
  "location": "DepositAmountTest.iClickOnDepositButton()"
});
formatter.result({
  "duration": 285991000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 34
    }
  ],
  "location": "DepositAmountTest.iShouldEnterAmountToDeposit(String)"
});
formatter.result({
  "duration": 279859300,
  "status": "passed"
});
formatter.match({
  "location": "DepositAmountTest.iClickOnDepositTab()"
});
formatter.result({
  "duration": 132420400,
  "status": "passed"
});
formatter.match({
  "location": "DepositAmountTest.iShouldVerifyTheTextMessageThatMoneyDepositedSuccessfully()"
});
formatter.result({
  "duration": 79191100,
  "status": "passed"
});
formatter.match({
  "location": "WithdralAmountTest.iClickOnWithdralButton()"
});
formatter.result({
  "duration": 607147900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 35
    }
  ],
  "location": "WithdralAmountTest.iShouldEnterAmountToWithdraw(String)"
});
formatter.result({
  "duration": 632045800,
  "status": "passed"
});
formatter.match({
  "location": "WithdralAmountTest.iClickOnWithdralLink()"
});
formatter.result({
  "duration": 118512000,
  "status": "passed"
});
formatter.match({
  "location": "WithdralAmountTest.iShouldSeeTheMeessageThatTransactionIsSuccessful()"
});
formatter.result({
  "duration": 575043400,
  "status": "passed"
});
formatter.after({
  "duration": 1192573800,
  "status": "passed"
});
});