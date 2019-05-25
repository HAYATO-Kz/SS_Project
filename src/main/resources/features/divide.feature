Feature:
    As a user
    I want to use minus function
    so that i can get quotient

Scenario: get quotient of 2 number
    When divide 20 with 5
    Then answer is 4

Scenario: get quotient of 2 negative number
    When divide -20 with -5
    Then answer is 4

Scenario: divide with negative number
    When divide 20 with -5
    Then answer is -4

Scenario: divide with decimal number
    When divide 20 with 2.5
    Then answer is 8


