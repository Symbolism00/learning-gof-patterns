package observer;

public class WindowSensor implements Observer {

    private boolean openWindow;
    private boolean runBlindsDown;
    private EntraceHallSensor entraceHallSensor;

    public WindowSensor(EntraceHallSensor entraceHallSensor){
        this.entraceHallSensor = entraceHallSensor;
        openWindow = false;
        runBlindsDown = true;
    }

    @Override
    public void update() {
        // caso esteja alguém em casa então abre-se as janelas e sobe-se os estoros
        // se não estiver ninguém então fecha-se as janelas e desce-se os estoros
        this.openWindow = entraceHallSensor.isAnyoneAtHome();
        this.runBlindsDown = !entraceHallSensor.isAnyoneAtHome();
    }

    @Override
    public String currentState(){
        return "Window current state -> Open Window: " + openWindow + " Blinds Down: " + runBlindsDown;
    }
}
