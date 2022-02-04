package abstract_factory;

// classe genérica que representa uma componente existente no desporto a ser criado
// por exemplo, rede no caso do desporto ser ténis ou baliza no caso do desporto ser futebol
public abstract class ComponentObject {

    // contém informações relativas à altura e largura destas componentes
    private double width;
    private double height;

    public ComponentObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    // informação relativa ao dados genéricos
    @Override
    public String toString(){
        return "width of " + width + " m, height of " + height + " m";
    }
}
