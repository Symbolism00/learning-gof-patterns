package abstract_factory;

// classe que representa uma rede
public class Net extends ComponentObject {

    // contém informação sobre o tipo de linha e a área dos buracos na rede
    private String lineType;
    private double holeArea;

    public Net(double width, double height, String lineType, double holeArea) {
        super(width, height);
        this.lineType = lineType;
        this.holeArea = holeArea;
    }

    // informação de todos os dados de uma rede
    @Override
    public String toString(){
        return "Created a net with " + super.toString() + ", line type of " + lineType
                + ", and hole area of " + holeArea + " cm2";
    }
}
