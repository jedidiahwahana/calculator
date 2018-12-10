import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class Calculator {

    private char sign;
    private long firstNumber;
    private long secondNumber;
    private long result;

    @Given("a Calculator Class with the operation sign as <sign>")
    public void givenACalculatorClassWithTheOperationSignAssign(@Named("sign") String sign) {
        this.sign = sign.charAt(0);

        switch (this.sign) {
            case '+':
                System.out.println("Addition Operation");
                break;
            case '-':
                System.out.println("Subtraction Operation");
                break;
            case '*':
                System.out.println("Multiplication Operation");
                break;
            case '/':
                System.out.println("Division Operation");
                break;
            default:
                System.out.println("Please give a correct operation");
        }
    }

    @When("I give the first number as <firstNumber>")
    public void whenIGiveTheFirstNumberAsfirstNumber(@Named("firstNumber") long firstNumber) {
        this.firstNumber = firstNumber;
    }

    @When("I give the second number as <secondNumber>")
    public void whenIGiveTheSecondNumberAssecondNumber(@Named("secondNumber") long secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Then("I should get the result as <result>")
    public void thenIShouldGetTheResultAsresult(@Named("result") long result) {
        Operations operations = new Operations();

        switch (this.sign) {
            case '+':
                this.result = operations.addition(firstNumber, secondNumber);
                Assert.assertEquals(this.result, result);
                break;
            case '-':
                this.result = operations.subtraction(firstNumber, secondNumber);
                Assert.assertEquals(this.result, result);
                break;
            case '*':
                this.result = operations.multiplication(firstNumber, secondNumber);
                Assert.assertEquals(this.result, result);
                break;
            case '/':
                this.result = operations.division(firstNumber, secondNumber);
                Assert.assertEquals(this.result, result);
                break;
            default:
                System.out.println("");
        }
    }
}