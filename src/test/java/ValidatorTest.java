import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validate() {
        List<Equation> e = new ArrayList<>();
        e.add(new Equation(Operations.SUBTRACT,20));
        e.add(new Equation(Operations.DIVIDE,5 ));
        e.add(new Equation(Operations.MULTIPLY,100 ));
        e.add(new Equation(Operations.DIVIDE,0 ));
        e.add(new Equation(Operations.APPLY ,25 ));
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Validator().validate(Operations.DIVIDE,0);
        });
        String expectedMessage = "Nie mozna dzielic przez 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}