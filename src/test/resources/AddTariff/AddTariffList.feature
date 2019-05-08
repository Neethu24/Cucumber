
Feature: New Tariff plan addition

  Scenario: To add a new tariff
    Given the user is in the add tariff planss
    When the user enters vaild field value
    |first|second|three|four|five|six|seven|
		|111|222|333|444|555|666|777|
		|11|222|33|44|555|66|77|
    Then user plan is addeds
