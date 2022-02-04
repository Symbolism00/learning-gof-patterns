package factory_method;

public class HawaiianPizza extends Pizza {

    private final int numberOfPineapple;

    // pizza havaiana que tem número de ananás
    public HawaiianPizza(int diameter, double baseCost, int numberOfPineapple) {
        super(diameter, baseCost);
        this.numberOfPineapple = numberOfPineapple;
    }

    // informação sobre a pizza
    @Override
    public String toString(){
        return "Hawaiian Pizza with " + numberOfPineapple  + " pineapple slices, " + super.toString();
    }
}
