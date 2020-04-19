
public class Validator {
    public void validate(Operations operations, double number) throws ArithmeticException {
        if(operations==Operations.DIVIDE && number == 0){
            throw new ArithmeticException("Nie mozna dzielic przez 0");
        }
    }
}
