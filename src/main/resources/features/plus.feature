Feature:
    As a user
    I want to use plus function
    so that i can get sum

Scenario: get summation of 2 number
    When plus 20 with 30
    Then answer is 50

Scenario: get sum of 2 negative number
    When plus -20 with -30
    Then answer is -50

Scenario: plus with negative value
    When plus 20 with -30
    Then answer is -10

Scenario: plus with decimal value
    When plus 20 with 2.5
    Then answer is 22.5


