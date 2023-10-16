import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSoma(){
        Calculator calculation = new Calculator();
        int sum = calculation.calc(2,5);
        int sumTest = 6;
        assertEquals(sum, sumTest, "Error on sum's calculation!!");
    }

}
