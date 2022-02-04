package abstract_factory;

// classe responsável por criar objetos que fazem parte do desporto ténis.
// Apenas objetos que fazem sentido são produzidos na mesma fábrica, sendo que
// no ténis só faz sentido ter uma bola como objeto jogável e
// uma rede como componente do campo
public class TennisFactory implements SportFactory {

    // método responsável por implementar a instanciação de uma bola com as proprieades específicas
    // de uma bola de ténis
    @Override
    public PlayableObject createPlayableObject() {
        return new Ball(5, 5, "sphere", 1.3, "Adidas");
    }

    @Override
    public ComponentObject createComponentObject() {
        return new Net(10, 1.5, "nylon", 4);
    }
}
