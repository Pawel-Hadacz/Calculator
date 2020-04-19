import java.util.List;

public class Calculator {
    public double calc(List<Equation> equationList){
        double apply = equationList.get(equationList.size()-1).getNumber();
        equationList.remove(equationList.size()-1);
        for(Equation e : equationList){
                double res = e.getOperation().fun.apply(apply, e.getNumber());
                apply = res;
        }
        return apply;
    }
}
