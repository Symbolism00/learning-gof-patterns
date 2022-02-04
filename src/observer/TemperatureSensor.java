package observer;

public class TemperatureSensor implements Observer{

    private double homeTemperature;
    private EntraceHallSensor entraceHallSensor;

    public TemperatureSensor(EntraceHallSensor entraceHallSensor){
        this.homeTemperature = 20;
        this.entraceHallSensor = entraceHallSensor;
    }

    @Override
    public void update() {
        // caso esteja alguém em casa, então o aquecimento central aumenta
        // e a temperatura sobe para 25 graus
        if(entraceHallSensor.isAnyoneAtHome()){
            this.homeTemperature = 25;
        }else{
            // se não estiver ninguém em casa, então a temperatura desce para 20 graus
            this.homeTemperature = 20;
        }
    }

    @Override
    public String currentState(){
        return "Temperature current state -> Temperature: " + homeTemperature + "ºC";
    }
}
