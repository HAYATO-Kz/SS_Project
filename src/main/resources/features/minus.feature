Feature:
    As a user
    I want to use minus function
    so that i can get difference

Scenario: get difference of 2 negative number
    When minus -40 with -30
    Then answer is -10

Scenario: minus with negative number
    When minus 40 with -30
    Then answer is 70

Scenario: get difference of 2  number
    When minus 40 with 30
    Then answer is 10

Scenario: minus with decimal number
    When minus 40 with 0.1
    Then answer is 39.9