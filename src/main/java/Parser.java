import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<Equation> equationList = new ArrayList<>();
    public void parse() {
        Validator validator = new Validator();
        String path = null;
        try {
            path = Paths.get(Main.class.getClassLoader()
                    .getResource("Sample").toURI()).toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] line = temp.split("\\s+");
                Operations operation = Operations.valueOf(line[0].toUpperCase());
                Double number = Double.valueOf(line[1]);
                validator.validate(operation,number);
                equationList.add(new Equation(operation, number));
                if(operation == Operations.APPLY){
                    break;
                }
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }
}
