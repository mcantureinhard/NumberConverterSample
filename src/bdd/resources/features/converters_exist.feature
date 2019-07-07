Feature: converters are implemented?
  We want to know if all converters are implemented

  Scenario: We can convert Binary
    Given the list of providers
    When I check "Binary" is there
    Then It should be true

  Scenario: We can convert Hexadecimal
      Given the list of providers
      When I check "Hexadecimal" is there
      Then It should be true

  Scenario: We can convert Roman
      Given the list of providers
      When I check "Roman" is there
      Then It should be true