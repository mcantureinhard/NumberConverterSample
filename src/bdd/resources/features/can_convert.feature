Feature: can convert?
    Scenario: Convert Decimal to Binary
        Given I want to convert from "Decimal"
        And I want to convert to "Binary"
        When input is "5"
        Then output is "101"
    Scenario: Convert Binary to Decimal
        Given I want to convert from "Binary"
        And I want to convert to "Decimal"
        When input is "111101"
        Then output is "61"