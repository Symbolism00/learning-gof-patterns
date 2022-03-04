package prototype;

// classe concreta que representa um carro robot com diversas propriedades
// é um tipo de robot existente
public class CarRobot extends Robot{

    // um carro robot pode ter asas ou não
    private boolean hasWings;

    public CarRobot(String material, double height, String color, boolean hasWings, Battery battery, Iq iq){
        super(material, height, color, battery, iq);
        this.hasWings = hasWings;
    }

    // construtor responsável pela criação de clones de carros robot
    private CarRobot(CarRobot carRobot){
        // copia todos os dados para o novo objeto a ser instanciado
        super(carRobot);
        this.hasWings = carRobot.hasWings;
    }

    // método responsável pelo clone de protótipos
    // este método encontra-se na superclasse, porém também poderia estar numa interface
    // tal como acontece entre a Interface Prototype e a classe Iq
    @Override
    public Robot clone() {
        return new CarRobot(this);
    }

    // método que retorna as propriedades de um carro robot
    @Override
    public String toString(){
        return super.toString() + "\nHas Wings: " + hasWings;
    }

}
