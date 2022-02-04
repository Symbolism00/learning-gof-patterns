package abstract_factory;

// classe genérica que representa umo objeto jogável existente no desporto a ser criado
// por exemplo, bola de futebol no caso do desporto ser futebol, bola de ténis no caso
// do desporto ser futebol e disco de hóquei no caso do desporto ser hóquei no gelo
public abstract class PlayableObject {

    // contém informações relativas à altura, largura e formato do objeto
    private double width;
    private double height;
    private String format;

    public PlayableObject(double width, double height, String format){
        this.width = width;
        this.height = height;
        this.format = format;
    }

    // informação relativa ao dados genéricos
    @Override
    public String toString(){
        return "width of " + width + " cm" + ", height of " + height + ", format of " + format;
    }

    // método abstrato que dependerá do tipo de objeto que foi instanciado, cada um tem a sua implementação
    // (comportamento) que neste caso será muito simples, apenas irá dizer se ressalta ou não
    public abstract boolean bounce();

}
