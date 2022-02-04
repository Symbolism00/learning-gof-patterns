package abstract_factory;

// classe que representa uma bola
public class Ball extends PlayableObject {

    // contém informação sobre a pressão máxima que suporta e sobre a marca que a criou
    private double maxPressure;
    private String brand;

    public Ball(double width, double height, String format, double maxPressure, String brand) {
        super(width, height, format);
        this.maxPressure = maxPressure;
        this.brand = brand;
    }

    // informação sobre todas as proprieadades da bola
    @Override
    public String toString(){
        return "Created a ball with " + super.toString() + ", max pressure of "
                + maxPressure + " bar, and brand of " + brand;
    }

    // método polifórmico que informa se o objeto ressalta ou não
    // uma bola ressalta bem e por isso retorna-se true
    @Override
    public boolean bounce() {
        return true;
    }
}
