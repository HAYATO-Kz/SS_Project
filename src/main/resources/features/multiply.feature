Feature:
    As a user
    I want to use multiply function
    so that i can get product

Scenario: get product of 2 number
    When multiply 5 with 20
    Then answer is 100

Scenario: get product of 2 negative number
    When multiply -5 with -20
    Then answer is 100

Scenario: multiply with negative number
    When multiply 5 with -20
    Then answer is -100

Scenario: multiply with deciaml number
    When multiply 5 with 0.5
    Then answer is 2.5

