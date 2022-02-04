package observer;

public class LightSensor implements Observer{

    private boolean turnOfLights;
    private EntraceHallSensor entraceHallSensor;

    public LightSensor(EntraceHallSensor entraceHallSensor){
        this.entraceHallSensor = entraceHallSensor;
    }

    @Override
    public void update() {
        // liga as luzes de casa caso esteja alguém em casa
        // se não estiver então desliga-as
        this.turnOfLights = entraceHallSensor.isAnyoneAtHome();
    }

    @Override
    public String currentState(){
        return "Lights current state -> On: " + turnOfLights;
    }
}
