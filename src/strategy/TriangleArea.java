package strategy;

public class TriangleArea implements AreaStrategy{

    private double base;
    private double height;

    public TriangleArea(double base, double height){
        this.base = base;
        this.height = height;
    }

    // calcula a área de triângulo
    @Override
    public double execute() {
        return base * height / 2;
    }

}
