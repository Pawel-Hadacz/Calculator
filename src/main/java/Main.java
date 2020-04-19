
public class Main {
    public static void main(String[] args) {
       Parser parser = new Parser();
       parser.parse();
       Calculator calculator = new Calculator();
       System.out.println(calculator.calc(Parser.equationList));
    }
}
