@tag
Feature: New Tariff plan addition

  Scenario: To add a new tariff
    Given the user is in the add tariff plans
    When the user enters vaild field values
    Then user plan is added
