package observer;

// interface usada pelo o objeto que está a ser observado e que altera de X em X sec
public interface Observable {

    // adiciona um observador à lista de observadores
    void addObserver(Observer observer);

    // remove um observador da lista de observadores
    void removeObserver(Observer observer);

    // notifica todos os observadores que estão na lista de observadores
    void notifyObservers();
}
