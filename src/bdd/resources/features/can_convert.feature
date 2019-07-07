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
    Scenario: Convert Decimal to Hexadecimal
        Given I want to convert from "Hexadecimal"
        And I want to convert to "Decimal"
        When input is "DEADBEEF"
        Then output is "3735928559"
    Scenario: Convert Hexadecimal to Decimal
        Given I want to convert from "Decimal"
        And I want to convert to "Hexadecimal"
        When input is "1234567"
        Then output is "12D687"
     Scenario: Convert Decimal to Roman
         Given I want to convert from "Roman"
         And I want to convert to "Decimal"
         When input is "58"
         Then output is "LVIII"
     Scenario: Convert Roman to Decimal
         Given I want to convert from "Decimal"
         And I want to convert to "Roman"
         When input is "MCMXCIV"
         Then output is "1994"