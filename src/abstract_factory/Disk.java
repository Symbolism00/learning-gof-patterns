package abstract_factory;

// classe que representa um disco do hóquei no gelo
public class Disk extends PlayableObject {

    // contém informação sobre o material em que o disco foi construído
    private String material;

    public Disk(double width, double height, String format, String material) {
        super(width, height, format);
        this.material = material;
    }

    // informação sobre todas as proprieadades do disco
    @Override
    public String toString(){
        return "Created a disk with " + super.toString() + ", and material of " + material;
    }

    // método polifórmico que informa se o objeto ressalta ou não
    // o disco de hóquei por norma não ressalta ou ressalta muito pouco, mas
    // assume-se que não ressalta e por isso retorna-se false
    @Override
    public boolean bounce() {
        return false;
    }
}
