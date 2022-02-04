package abstract_factory;

// classe responsável por criar objetos que fazem parte do desporto hóquei no gelo.
// Apenas objetos que fazem sentido são produzidos na mesma fábrica, sendo que
// o hóquei no gelo só faz sentido com um disco de hóquei como objeto jogável e
// com uma baliza como componente do campo
public class HockeyFactory implements SportFactory {

    // método responsável por implementar a instanciação de um disco de hóquei
    @Override
    public PlayableObject createPlayableObject() {
        return new Disk(3, 5, "cylinder", "plastic");
    }

    // método responsável por implementar a instanciação de uma baliza com as proprieades específicas
    // de uma baliza de hóquei
    @Override
    public ComponentObject createComponentObject() {
        return new Goal(1.5, 1.5, 10);
    }
}
