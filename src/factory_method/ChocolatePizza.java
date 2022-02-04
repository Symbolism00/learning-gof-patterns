package factory_method;

public class ChocolatePizza extends Pizza{

    private final int numberOfStrawberries;

    // pizza de chocolate que tem número de morangos
    public ChocolatePizza(int diameter, double baseCost, int numberOfStrawberries) {
        super(diameter, baseCost);
        this.numberOfStrawberries = numberOfStrawberries;
    }

    // informação sobre a pizza
    @Override
    public String toString(){
        return "Chocolate Pizza with " + numberOfStrawberries + " number of strawberries, " + super.toString();
    }
}
