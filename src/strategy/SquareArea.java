package strategy;

public class SquareArea implements AreaStrategy{

    private double side;

    public SquareArea(double side){
        this.side = side;
    }

    // calcula a area de um quadrado
    @Override
    public double execute() {
        return side * side;
    }
}
