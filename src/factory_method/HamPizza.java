package factory_method;

public class HamPizza extends Pizza{

    private final String hamType;

    // pizza de fiambre que tem um tipo de fiambre
    public HamPizza(int diameter, double baseCost, String hamType){
        super(diameter, baseCost);
        this.hamType = hamType;
    }

    // informação sobre a pizza
    @Override
    public String toString(){
        return "Ham Pizza with " + hamType + " ham, " + super.toString();
    }
}
