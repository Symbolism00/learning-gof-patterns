package observer;

import java.util.ArrayList;
import java.util.List;

public class EntraceHallSensor implements Observable {

    private List<Observer> observers;
    // variável que verifica se chegou alguém a casa
    // ou se saiu algúem de casa
    private boolean isAnyoneAtHome;

    public EntraceHallSensor(){
        this.observers = new ArrayList<>();
        isAnyoneAtHome = false;
    }

    // Adiciona um novo observador à lista de observadores
    @Override
    public void addObserver(Observer observer) {
        if(observer != null){
            this.observers.add(observer);
        }
    }

    // Remove um observador da lista de observadores
    @Override
    public void removeObserver(Observer observer) {
        if(observer != null){
            this.observers.remove(observer);
        }
    }

    // Notifica cada um dos observadores da lista de observadores
    @Override
    public void notifyObservers() {
        // por cada observador, chama o método update para que eles saibam
        // que ocorreu uma alteração do estado no objeto Observable
        for(Observer observer : observers){
            observer.update();
        }
    }

    public boolean isAnyoneAtHome() {
        return isAnyoneAtHome;
    }

    public void toggleAnyoneAtHome() {
        // a pessoa entra ou sai
        this.isAnyoneAtHome = !isAnyoneAtHome;
    }
}
