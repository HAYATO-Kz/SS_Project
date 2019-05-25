$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/divide.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "  As a user\n  I want to use minus function\n  so that i can get quotient",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "get quotient of 2 number",
  "description": "",
  "id": ";get-quotient-of-2-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "divide 20 with 5",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "answer is 4",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 7
    },
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "StepDefCalculator.divide_function(String,String)"
});
formatter.result({
  "duration": 124565693,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 10
    }
  ],
  "location": "StepDefCalculator.get_Answer(String)"
});
formatter.result({
  "duration": 4794742,
  "status": "passed"
});
});