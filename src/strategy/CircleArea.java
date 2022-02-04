package strategy;

public class CircleArea implements AreaStrategy{

    private double diameter;

    public CircleArea(double diameter){
        this.diameter = diameter;
    }

    // calcula a área de um círculo
    @Override
    public double execute() {
        return Math.pow(diameter / 2, 2) * Math.PI ;
    }
}
