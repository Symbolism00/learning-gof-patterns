package prototype;

// classe concreta que representa um robot humano com diversas propriedades
// é um tipo de robot existente
public class HumanRobot extends Robot{

    // um robot humano tem vários braços
    private int numberOfArms;

    public HumanRobot(String material, double height, String color, int numberOfArms, Battery battery, Iq iq){
        super(material, height, color, battery, iq);
        this.numberOfArms = numberOfArms;
    }

    // construtor responsável pela criação de clones de robot humanos
    private HumanRobot(HumanRobot humanRobot){
        // copia todos os dados para o novo objeto a ser instanciado
        super(humanRobot);
        this.numberOfArms = humanRobot.numberOfArms;
    }

    // método responsável pelo clone de protótipos
    // este método encontra-se na superclasse, porém também poderia estar numa interface
    // tal como acontece entre a Interface Prototype e a classe Iq
    @Override
    public Robot clone() {
        return new HumanRobot(this);
    }

    // método que retorna as propriedades de um robot humano
    @Override
    public String toString(){
        return super.toString() + "\nNumber of Arms: " + numberOfArms;
    }
}
