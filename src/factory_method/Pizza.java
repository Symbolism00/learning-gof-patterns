package factory_method;

// classe genérica que representa a pizza
// todas as pizzas contÊm um diâmetro e um custo base
public abstract class Pizza {

    private final int diameter;
    private final double baseCost;

    public Pizza(int diameter, double baseCost){
        this.diameter = diameter;
        this.baseCost = baseCost;
    }

    @Override
    public String toString(){
        return "has " + diameter + " cm of diameter and costs " + baseCost + " euros";
    }
}
