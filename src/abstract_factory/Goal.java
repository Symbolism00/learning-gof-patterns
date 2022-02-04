package abstract_factory;

// classe que representa uma baliza
public class Goal extends ComponentObject {

    // contém informação sobre o tamanho dos postes
    private double postSize;

    public Goal(double width, double height, double postSize) {
        super(width, height);
        this.postSize = postSize;
    }

    // informação de todos os dados de uma baliza
    @Override
    public String toString(){
        return "Created a goal with " + super.toString() + ", and post size of " + postSize;
    }
}
