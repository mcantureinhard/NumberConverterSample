Feature: converters are implemented?
  We want to know if all converters are implemented

  Scenario: We can convert Binary
    Given the list of providers
    When I check "Binary" is there
    Then It should be true