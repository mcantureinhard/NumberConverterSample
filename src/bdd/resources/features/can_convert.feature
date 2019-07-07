Feature: can convert?
    Scenario: Convert Decimal to Binary
        Given I want to convert from "Decimal"
        And I want to convert to "Binary"
        When input is "5"
        Then output is "101"