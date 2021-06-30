Feature:    xyz Bank Test
  As a bank manager I want to open the account for customer, add customer and allow him to withdraw and deposit money successfully

  Background:
  I am on home page

  @Sanity,@smoke,@Regression
  Scenario: Verify that bank manager should add customer successfully
    Given I am on home page
    And I click on bankManager login Link
    And I click on add to customer tab
    And I enter First Name<"Virat">
    And I enter Last Name<"Mehta">
    And I enter postCode<"NW9 9HN">
    When I click on add customer button
    Then I should verify pop up message
    And I accept pop up

@Smoke,@Regression
  Scenario: Verify bank manager Open account for customer Successfully
    Given I am on home page
    And I click on bankManager login Link
    And I click on add to customer tab
    And I enter First Name<"Virat">
    And I enter Last Name<"Mehta">
    And I enter postCode<"NW9 9HN">
    When I click on add customer button
    Then I should verify pop up message
    And I accept pop up

    And I click on open account tab
    And I select name of customer from drop down<"Virat Mehta">
    And I select currency<"Pound">
    When I click on process button
    Then I should verify the message
    And I accept pop up


@Regression
  Scenario: Verify user Login and Logout from account successfully
    Given I am on home page
    And I click on bankManager login Link
    And I click on add to customer tab
    And I enter First Name<"Virat">
    And I enter Last Name<"Mehta">
    And I enter postCode<"NW9 9HN">
    When I click on add customer button
    Then I should verify pop up message
    And I accept pop up

    And I click on open account tab
    And I select name of customer from drop down<"Virat Mehta">
    And I select currency<"Pound">
    When I click on process button
    Then I should verify the message
    And I accept pop up

    And I click on Home Button Link
    And I click on customer Login Link
    And I select name of customer from drop down<"Virat Mehta">
    When I click on Login Link
    Then I should see that Log out button is displayed
    And I should see verify the text Logout
    When I click on Log Out Button
    Then I should see the your name text is displayed "Your Name"
    And I should verify the test Your Name

@Regression
  Scenario: Verify user should deposit money in to account successfully

  Given I am on home page
  And I click on bankManager login Link
  And I click on add to customer tab
  And I enter First Name<"Virat">
  And I enter Last Name<"Mehta">
  And I enter postCode<"NW9 9HN">
  When I click on add customer button
  Then I should verify pop up message
  And I accept pop up

  And I click on open account tab
  And I select name of customer from drop down<"Virat Mehta">
  And I select currency<"Pound">
  When I click on process button
  Then I should verify the message
  And I accept pop up

  And I click on Home Button Link
  And I click on customer Login Link
  And I select name of customer from drop down<"Virat Mehta">
  And I click on Login Link
  When I click on deposit button
  Then I should enter amount to deposit "100"
  When I click on deposit tab
  Then I should verify the text message that money deposited successfully
  And I click on Home Button Link

  @Regression

  Scenario: Verify user should withdraw money from account successfully

    Given I am on home page
    And I click on bankManager login Link
    And I click on add to customer tab
    And I enter First Name<"Virat">
    And I enter Last Name<"Mehta">
    And I enter postCode<"NW9 9HN">
    When I click on add customer button
    Then I should verify pop up message
    And I accept pop up

    And I click on open account tab
    And I select name of customer from drop down<"Virat Mehta">
    And I select currency<"Pound">
    When I click on process button
    Then I should verify the message
    And I accept pop up

    And I click on Home Button Link
    And I click on customer Login Link
    And I select name of customer from drop down<"Virat Mehta">
    And I click on Login Link
    When I click on deposit button
    Then I should enter amount to deposit "100"
    When I click on deposit tab
    Then I should verify the text message that money deposited successfully

    When I click on withdral button
    And I should enter amount to withdraw "50"
    And I click on withdral Link
    Then I should see the meessage that transaction is successful


