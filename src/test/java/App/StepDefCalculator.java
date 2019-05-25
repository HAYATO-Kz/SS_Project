package App;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefCalculator {

   private Calculator calculator = Calculator.getInstance();

   @Before
   public void reset(){
       calculator.reset();
   }

    @When("^plus ([-+]?[0-9]*\\.?[0-9]+) with ([-+]?[0-9]*\\.?[0-9]+)")
    public void plus_function(String a, String b) {
        calculator.serFunction(new PlusFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^minus ([-+]?[0-9]*\\.?[0-9]+) with ([-+]?[0-9]*\\.?[0-9]+)")
    public void minus_function(String a, String b) {
        System.out.println(a);
        System.out.println(b);
        calculator.serFunction(new MinusFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^multiply ([-+]?[0-9]*\\.?[0-9]+) with ([-+]?[0-9]*\\.?[0-9]+)")
    public void multiply_function(String a, String b) {
        calculator.serFunction(new MultiplyFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @When("^divide ([-+]?[0-9]*\\.?[0-9]+) with ([-+]?[0-9]*\\.?[0-9]+)")
    public void divide_function(String a, String b) {
        calculator.serFunction(new DivideFunction());
        calculator.doFunction(a);
        calculator.doFunction(b);
    }

    @Then("^answer is ([-+]?[0-9]*\\.?[0-9]+)")
    public void get_Answer(String answer){
        assertEquals(answer,calculator.getAnswer());
    }
}
