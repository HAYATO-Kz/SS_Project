package App;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefCalculator {

   private Calculator calculator = Calculator.getInstance();


    @When("^plus (\\d+) with (\\d+)")
    public void plus_function(String a, String b) {
        calculator.serFunction(new PlusFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^minus (\\d+) with (\\d+)")
    public void minus_function(String a, String b) {
        calculator.serFunction(new MinusFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^multiply (\\d+) with (\\d+)")
    public void multiply_function(String a, String b) {
        calculator.serFunction(new MultiplyFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^divide (\\d+) with (\\d+)")
    public void divide_function(String a, String b) {
        calculator.serFunction(new DivideFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @Then("^answer is (\\d+)")
    public void get_Answer(String answer){
        assertEquals(answer,calculator.getAnswer());
    }
}
