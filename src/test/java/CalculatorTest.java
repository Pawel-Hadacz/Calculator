import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    void calc() {
        List<Equation> e = new ArrayList<>();
        e.add(new Equation(Operations.ADD,4));
        e.add(new Equation(Operations.MULTIPLY,3 ));
        e.add(new Equation(Operations.APPLY ,3 ));
        Calculator calculator = new Calculator();
        double result = calculator.calc(e);
        assertEquals(21,result);
    }
    @Test
    void Divide() {
        List<Equation> e = new ArrayList<>();
        e.add(new Equation(Operations.DIVIDE,2));
        e.add(new Equation(Operations.DIVIDE,5 ));
        e.add(new Equation(Operations.APPLY ,10 ));
        Calculator calculator = new Calculator();
        double result = calculator.calc(e);
        assertEquals(1,result);
    }
    @Test
    void subtract() {
        List<Equation> e = new ArrayList<>();
        e.add(new Equation(Operations.SUBTRACT,20));
        e.add(new Equation(Operations.DIVIDE,2 ));
        e.add(new Equation(Operations.APPLY ,25 ));
        Calculator calculator = new Calculator();
        double result = calculator.calc(e);
        assertEquals(2.5,result);
    }
    @Test
    void multiOperation() {
        List<Equation> e = new ArrayList<>();
        e.add(new Equation(Operations.SUBTRACT,20));
        e.add(new Equation(Operations.DIVIDE,5 ));
        e.add(new Equation(Operations.MULTIPLY,100 ));
        e.add(new Equation(Operations.ADD,1 ));
        e.add(new Equation(Operations.APPLY ,25 ));
        Calculator calculator = new Calculator();
        double result = calculator.calc(e);
        assertEquals(101,result);
    }
}