# Autor: Harold
@userstory
Feature: Utest
  As an unregistered user I want to enter the utest page to create my user

  @testcase
  Scenario: Register a new user
    Given I am on the utest page and I click on the Join Today button
    When Complete the registration forms with my data
      | fisrtName | lastName    | emailAddress                      | city     | postalCode | password       | confirmPassword |
      | Harold    | Altamiranda | haltamirandas@choucairtesting.com | Medellín | 050016     | Harold_29as123 | Harold_29as123  |
    Then I verify that when entering with the new user I get a button with the following message "Resend Confirmation Email"