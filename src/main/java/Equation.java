
public class Equation {

    private Operations operation;
    private double number;


    public Equation(Operations operation, double number) {
        this.operation = operation;
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Operations getOperation() {
        return operation;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Equation{" +
                "operation='" + operation + '\'' +
                ", number=" + number +
                '}';
    }
}
