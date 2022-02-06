package command;

public class Image {

    // uma imagem a ser desenhada tem um URL e coordenadas do seu centro
    private String url;
    private double x;
    private double y;

    public Image(String url, double x, double y){
        this.url = url;
        this.x = x;
        this.y = y;
    }

    // informação sobre a imagem
    @Override
    public String toString(){
        return "Image URL: " + url + ". X: " + x + " and Y: " + y;
    }
}
