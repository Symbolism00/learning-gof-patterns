package command;

public class Line {

    // uma linha a ser desenhada tem a coordenada superior e a coordenada inferior
    private double topX;
    private double bottomX;
    private double topY;
    private double bottomY;

    public Line(double topX, double bottomX, double topY, double bottomY) {
        this.topX = topX;
        this.bottomX = bottomX;
        this.topY = topY;
        this.bottomY = bottomY;
    }

    // informação sobre a linha
    @Override
    public String toString(){
        return "Line with start X at " + topX + ", start Y at " + topY
                + ", end X at " + bottomX + ", and end Y at " + bottomY;
    }
}
