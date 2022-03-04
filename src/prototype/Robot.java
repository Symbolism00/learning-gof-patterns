package prototype;

// classe abstrata que representa um robot que pode ser do tipo CarRobot ou HumanRobot
// esta é abstrata também pelo facto de apresentar o método clone() que em vez de estar
// numa interface, encontra-se nesta superclasse. A implementação deste método depende
// entre os tipos de robots
public abstract class Robot {

    // propriedados de um robot
    protected String material;
    protected double height;
    protected String color;
    // robots que são clones de um protótipo perdem bateria ao mesmo tempo
    protected Battery battery;
    // robots que são clones de um protótipo não perdem QI da mesma forma
    protected Iq iq;

    public Robot(String material, double height, String color, Battery battery, Iq iq){
        this.material = material;
        this.height = height;
        this.color = color;
        // para que seja possível fazer com que todos os robots percam bateria ao mesmo tempo
        // quando um a perde, é declarar que a bateria do clone é igual à bateria do protótipo.
        // Isto faz com que ambas as baterias estejam a apontar para o mesmo espaço da memória,
        // logo se alterar a bateria do clone 5, as baterias de todos os outros clones também
        // serão afetadas com essa alteração
        // -> A bateria do robot é clonada através de um Shallow Clone
        this.battery = battery;
        // para que seja possível fazer com que todos os robots tenham o seu próprio QI, é necessário
        // instanciar um novo QI quando um robot é clonado. Este QI também terá um método de clone
        // para que o espaço de memória que é apontado seja diferente dos outros
        // -> O QI do robot é clonado através de um de Deep Clone
        this.iq = new Iq(iq);
    }

    // clone constructor que copia todos os dados de um protótipo
    public Robot(Robot robot){
        this(robot.material, robot.height, robot.color, robot.battery, robot.iq);
    }

    // alteração da bateria do robot
    public void setBatteryTimeLeft(double timeLeft){
        battery.setTimeLeft(timeLeft);
    }

    // alteração do QI do robot
    public void setIQValue(double value){
        iq.setValue(value);
    }

    // método abstrato que cada tipo de robot vai ter que implementar
    // cada tipo de robot sabe que tipo de objeto deve instanciar (ele próprio)
    public abstract Robot clone();

    // método que obtém as propriedades de um robot
    @Override
    public String toString(){
        return "Robot Demo properties:\nMaterial: " + material + "\nHeight: " + height
                + " m\nColor: " + color + "\nTime Left: " + battery.getTimeLeft() + "\nIQ: " + iq.getValue();
    }
}
