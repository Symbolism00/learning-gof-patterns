package command;

public class Text {

    // um texto a ser desenhada tem o conteúdo e a coordenada central
    private String content;
    private double x;
    private double y;

    public Text(String content, double x, double y){
        this.content = content;
        this.x = x;
        this.y = y;
    }

    // informação sobre o texto
    @Override
    public String toString(){
        return "Text content: " + content + ". X: " + x + " and Y: " + y;
    }
}
