package prototype;

// classe simples que representa o quociente de inteligência do robot
public class Iq implements Prototype{

    // valor do QI do robot
    private double value;

    public Iq(double value){
        this.value = value;
    }

    // construtor do protótipo
    public Iq(Iq iq){
        this.value = iq.value;
    }

    // à medida que o tempo passa, o robot pode aumentar ou diminuir QI
    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    @Override
    public Prototype clone() {
        // método de clonagem para que cada robot clonado tenha o seu próprio QI
        return new Iq(this);
    }
}
