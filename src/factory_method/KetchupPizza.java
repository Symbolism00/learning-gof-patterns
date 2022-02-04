package factory_method;

public class KetchupPizza extends Pizza{

    private final int ketchupQuantity;

    // pizza de chocolate que tem quantidade de ketchup
    public KetchupPizza(int diameter, double baseCost, int ketchupQuantity){
        super(diameter, baseCost);
        this.ketchupQuantity = ketchupQuantity;
    }

    // informações sobre a pizza
    @Override
    public String toString(){
        return "Ketchup Pizza with " + ketchupQuantity + " litre, " + super.toString();
    }
}
