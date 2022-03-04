package prototype;

// classe simples que representa a bateria de um robot
public class Battery {

    // tempo restante da bateria do robot
    private double timeLeft;

    public Battery(double timeLeft){
        this.timeLeft = timeLeft;
    }

    // o tempo de bateria à medida que o tempo passa, começa a diminuir
    public void setTimeLeft(double timeLeft){
        this.timeLeft = timeLeft;
    }

    public double getTimeLeft(){
        return timeLeft;
    }

}
