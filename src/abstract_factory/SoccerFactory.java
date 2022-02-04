package abstract_factory;

// classe responsável por criar objetos que fazem parte do desporto futebol.
// Apenas objetos que fazem sentido são produzidos na mesma fábrica, sendo que
// no futebol só faz sentido ter uma bola como objeto jogável e
// uma baliza como componente do campo
public class SoccerFactory implements SportFactory {

    // método responsável por implementar a instanciação de uma bola com as proprieades específicas
    // de uma bola de futebol
    @Override
    public PlayableObject createPlayableObject() {
        return new Ball(20, 20, "sphere", 6, "Nike");
    }

    // método responsável por implementar a instanciação de uma baliza com as proprieades específicas
    // de uma baliza de futebol
    @Override
    public ComponentObject createComponentObject() {
        return new Goal(6, 2.5, 20);
    }
}
