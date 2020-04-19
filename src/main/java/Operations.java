import java.util.function.BiFunction;

public enum Operations {
    ADD((a,b)->a+b),
    MULTIPLY((a,b)->a*b),
    DIVIDE((a,b)->a/b),
    SUBTRACT((a,b)->a-b),
    APPLY();
    Operations(BiFunction<Double,Double,Double> fun){
        this.fun=fun;
    }
    Operations(){
    }
    BiFunction<Double,Double,Double> fun;
}
